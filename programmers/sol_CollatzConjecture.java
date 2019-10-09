package algorithmStudy;

public class sol_CollatzConjecture {
	public int solution(int num) {
		int answer = 0;

		while (true) {
			if (num % 2 == 0) {
				num /= 2;
				answer++;
			} else if (num % 2 == 1) {
				num = num / 3 + 1;
				answer++;
			}
			
			if (num == 1)
				break;
		}

		return answer;
	}
}
