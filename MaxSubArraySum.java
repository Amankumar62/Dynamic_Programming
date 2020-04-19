
public class MaxSubArraySum {

	public int maxSum(int arr[]){
		int dp[] = new int[arr.length+1];
		if(arr[0] >= 0){
			dp[0] = arr[0];
		}
		int max_so_far = dp[0];
		
		for(int i=1;i<arr.length;i++){
			dp[i] = dp[i-1] + arr[i];
			if(dp[i]<0){
				dp[i] =0;
			}
			max_so_far = Math.max(dp[i],max_so_far);
		}
		return max_so_far;
	}
	public int maxSumSpaceOpt(int arr[]){
		int max_so_far=0;
		int curr_sum =0;
		for(int i=0;i<arr.length;i++){
			curr_sum += arr[i];
			if(curr_sum <0){
				curr_sum =0;
			}
			max_so_far = Math.max(curr_sum, max_so_far);
		}
		return max_so_far;
	}
	public static void main(String[] args) {
		int arr[] = {-3,2,5,-1,6,3,-2,7,-5,2};
		MaxSubArraySum max = new MaxSubArraySum();
		System.out.println(max.maxSum(arr));
		System.out.println(max.maxSumSpaceOpt(arr));
	}

}
