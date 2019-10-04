package leetCode;

import java.util.Arrays;

public class sol_twoSum {
	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        for ( int i = 0; i < nums.length; i++ ) {
            for ( int j = i+1; j < nums.length; j++ ) {
                int sum = nums[i] + nums[j];
                
                if (sum == target) {
                    answer[0] = i;
                    answer[1] = j;
                    
                    return answer;
                }
            }
        }
        
        return answer;
    }
}
