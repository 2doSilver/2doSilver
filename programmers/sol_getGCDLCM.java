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
		
		// �ִ�����
		while (m > 0) {
			temp = n;
			n = m;
			m = temp % m;
		}
		answer[0] = n;
		
		// �ּҰ����
		answer[1] = mul / n;
		
		return answer;
	}
}
