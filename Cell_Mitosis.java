
public class Cell_Mitosis {
	public static int mitosis(int n){
		int dp[] = new int[n+1];
		int x=2;
		int y =1;
		int z=3;
		dp[0] =0;
		dp[1] =0;
		for(int i=2;i<=n;i++){
			if(i%2 ==0){
				dp[i] = Math.min(dp[i/2]+x, dp[i-1]+y);
			}else{
				dp[i] = Math.min(dp[i-1]+y, dp[(i+1)/2]+x+z);
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println(mitosis(5));

	}

}
