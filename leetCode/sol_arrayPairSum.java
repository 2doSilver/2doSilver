package leetCode;

import java.util.Arrays;

public class sol_arrayPairSum {
	public static void main(String args[]) {
		System.out.println("arrayPairSum : " + arrayPairSum(new int[] {5, 3, 8, 9, 2, 6, 1, 7}));
	}

    public static int arrayPairSum(int[] nums) {
        int answer = 0;
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i += 2) {
        	answer += nums[i];
        }
        
        return answer;
    }
}
