
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
	public int mSTOBottomUp(int n){
		int dp[] = new int[n+1];
		dp[1] = 0;
		for(int i = 2;i<=n;i++){
			int op1 ,op2,op3;
			op1=op2=op3 = Integer.MAX_VALUE;
			
			if(i%3 == 0){
				op1 = dp[i/3];
			}
			if(i%2 == 0){
				op2 = dp[i/2];
			}
			
			op3 = dp[i-1];
			
			dp[i] = Math.min(op1, Math.min(op2, op3)) + 1;
		}
		return dp[n];
	}
	public static void main(String args[]){
		 MinimumStepToOne msto = new  MinimumStepToOne();
		System.out.println( msto.mSTOTopDown(10,new int[15]));
		System.out.println( msto.mSTOBottomUp(10));
		
	}
}
