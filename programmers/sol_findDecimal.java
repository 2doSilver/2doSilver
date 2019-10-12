package algorithmStudy;

public class sol_findDecimal {
	public int solution(int n) {
		int answer = 0;
		
		//에라토스테네스의 채
		boolean[] chk = new boolean[n+1]; // 기본값  false
		
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
