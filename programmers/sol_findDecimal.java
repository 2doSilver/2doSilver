package algorithmStudy;

public class sol_findDecimal {
	public int solution(int n) {
		int answer = 0;
		
		//�����佺�׳׽��� ä
		boolean[] chk = new boolean[n+1]; // �⺻��  false
		
		for (int i=2; i<=(int)Math.sqrt(n); i++) {
			for (int j=i; j*i<=n; j++) {
				chk[j*i] = true;
			}
		}
		
		for (int i=2; i<chk.length; i++) {
			if (chk[i] == false) 
				answer++;
		}
		
		return answer;
	}
}
