package algorithmStudy;

public class sol_square {
	public long solution(long n) {
		long answer = 0;
		
		int num = (int) Math.sqrt(n);
		double num2 = Math.sqrt(n);
		
		if (num == num2)
			answer = (long) Math.pow(num+1, 2);
		else 
			answer = -1;
		
		return answer;
		
		// �̰� �� �ȵƴ� ���� ������ �𸣰���
		/*long answer = 0;
		
		int num = (int) Math.sqrt(n);
		
		if (num * num == n)
			answer = (long) Math.pow(num+1, 2);
		else 
			answer = -1;
		
		return answer;*/
	}
}
