package algorithmStudy;

public class sol_subak {
	public String solution(int n) {
		String answer = "";
		String[] subak = {"¼ö", "¹Ú"};
		
		for (int i=0; i<n; i++) {
			answer += subak[i%2];
		}
		
		return answer;
	}
}
