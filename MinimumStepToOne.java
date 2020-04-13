
public class MinimumStepToOne {
	
	public int mSTOTopDown(int n, int dp[] ){
		if(n == 1){
			return 0;
		}
		if(dp[n] != 0){
			return dp[n];
		}
		int op1 ,op2,op3 ;
		op1 = op2 = op3 = Integer.MAX_VALUE;
		
		if(n%3 ==0){
			op1 = mSTOTopDown(n/3,dp)+1;
		}
		if(n%2 == 0){
		op2 = 	mSTOTopDown(n/2,dp)+1;
		}
		op3 = mSTOTopDown(n-1,dp)+1;
		
		int ans = Math.min(Math.min(op1,op2),op3);
		dp[n] = ans;
		return ans;
	}
	public static void main(String args[]){
		 MinimumStepToOne msto = new  MinimumStepToOne();
		System.out.println( msto.mSTOTopDown(10,new int[15]));
	}
}
