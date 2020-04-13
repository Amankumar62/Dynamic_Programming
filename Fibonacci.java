//top down approach
public class Fibonacci {
	
	public int fibTopDown(int n){
		int dp[] = new int[100];
		if(n == 0 || n ==1){
			return n;
		}
		if(dp[n] != 0){
			return dp[n];
		}
		int ans = fibTopDown(n-1) + fibTopDown(n-2);
		dp[n] = ans;
		return ans;
	}
	
	public int fibBottomUp(int n){
		if(n == 0 || n ==1){
			return n;
		}
		int a =0;
		int b =1;
		int c = 0;
		for(int i = 2;i<n;i++){
			c = a+b;
			a= b;
			b =c;
		}
		return c;
	}
	
	public static void main(String args[]){
		Fibonacci fibo = new Fibonacci();
		System.out.println(fibo.fibTopDown(45));
	}
	
}
