
public class Ladder_Problem {
	public static int ways(int n,int k,int dp[]){
		if(n==0){
			return 1;
		}
		if(dp[n]!=0){
			return dp[n];
		}
		int ways =0;
		for(int i=1;i<=k;i++){
			if(n-i>=0){
			ways += ways(n-i,k,dp);
			}
		}
		dp[n] = ways;
		return ways;
	}
	public static int waysBU(int n,int k){
		int dp[] = new int[n+1];
		dp[0] = 1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=k;j++){
				if(i-j>=0){
				dp[i] += dp[i-j];
				}
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		int n = 4;
		int dp[] = new int[n+1];
		System.out.println(ways(4,3,dp));
		System.out.println(waysBU(4,3));
		

	}

}
