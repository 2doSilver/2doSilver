package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sol_divArray {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> ans = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % divisor == 0) 
				ans.add(arr[i]);
		}
		
		if (ans.size() == 0)
			return new int[] {-1};
		
		answer = new int[ans.size()];
		for (int i=0; i<ans.size(); i++) {
			answer[i] = ans.get(i);
		}
		
		return answer;
	}
}
