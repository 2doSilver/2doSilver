package algorithmStudy;

public class sol_findKiminSeoul {
	public String solution(String[] seoul) {
		String answer = "";
		
		for (int i=0; i<seoul.length; i++) {
			if ("Kim".equals(seoul[i]))
				return "�輭���� " + i + "�� �ִ�";
		}
		
		return answer;
	}
}
