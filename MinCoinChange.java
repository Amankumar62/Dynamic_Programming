
public class MinCoinChange {

	public static int minCoinTD(int n , int coins[] , int dp[]){
		if(n ==0){
			return 0;
		}
		if(dp[n]!=0){
			return dp[n];
		}
		int ans =Integer.MAX_VALUE;
		for(int i =0 ; i<coins.length ; i++){
			if(n-coins[i]>=0){
				int subprob = minCoinTD(n-coins[i],coins,dp)+1;
				ans = Math.min(ans, subprob);
			}
		}
		dp[n] = ans;
		return ans;
	}
	public static int minCoinBU(int n,int coins[]){
		int dp[] = new int[n+1];
		
		for(int i =1;i<=n;i++){
			
			dp[i] = Integer.MAX_VALUE;
			for(int j=0;j<coins.length;j++){
				
				if((i - coins[j])>=0){
					
					int subprob = dp[i-coins[j]]+1;
					dp[i] = Math.min(dp[i], subprob);
					
				}
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println(minCoinTD(15,new int[] {1,7,10},new int[100]));
		System.out.println(minCoinBU(15,new int[] {1,7,10}));
		

	}

}
