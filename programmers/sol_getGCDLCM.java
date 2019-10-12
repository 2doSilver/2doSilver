package algorithmStudy;

public class sol_getGCDLCM {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int temp = 0;
		int mul = n * m;
		
		if (n < m) {
			temp = n;
			n = m;
			m = temp;
		}
		
		// 최대공약수
		while (m > 0) {
			temp = n;
			n = m;
			m = temp % m;
		}
		answer[0] = n;
		
		// 최소공배수
		answer[1] = mul / n;
		
		return answer;
	}
}
