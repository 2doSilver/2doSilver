package algorithmStudy;

public class sol_basicStr {
	public boolean solution(String s) {
		boolean answer = true;
		int len = s.length();
		
		if (len != 4 && len != 6)
			return false;
		
		for (int i=0; i<len; i++) {
			int chk = s.charAt(i);
			
			if (chk < 48 || chk > 57)
				return false;
		}
		
		return answer;
	}
}
