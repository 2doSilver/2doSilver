package algorithmStudy;

public class sol_nNum {
	public long[] solution(long x, int n) {
		long[] answer = new long[n];
	      
		for (int i=0; i<n; i++) {
			answer[i] = x * (i+1);
		}
		
		return answer;
		
		// 이거 왜 안되는지 의문
		/*long[] answer = new long[n];
		int i = 1;
		answer[0] = x;

		while (i == n) {
			answer[i] = answer[i - 1] + x;

			i++;
		}

		return answer;*/
	}
}
