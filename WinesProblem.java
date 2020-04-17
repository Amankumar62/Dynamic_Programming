
public class WinesProblem {

	public static int profit(int wines[],int i,int j,int y,int dp[][]){
		//Base case
		if(i>j){
			return 0;
		}
		
		if(dp[i][j] != 0){
			return dp[i][j];
		}
		//Recursive case
		int op1 = wines[i]*y + profit(wines,i+1,j,y+1,dp);
		int op2 = wines[j]*y + profit(wines,i,j-1,y+1,dp);
		
		int ans = Math.max(op1, op2);
		dp[i][j] = ans;
		return ans;
	}
	public static void main(String[] args) {
		int arr[] = {2,3,5,1,4}; 
		int i=0;
		int j=arr.length-1;
		int dp[][] = new int[arr.length+1][arr.length+1];
		int y=1;
		System.out.println(profit(arr,i,j,y,dp));

	}

}
