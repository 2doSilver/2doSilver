package algorithmStudy;

public class sol_hateSameNum {
	public int[] solution(int[] arr) {
		int chk = arr[0];
		int cnt = 1;
		
		for (int i=1; i<arr.length; i++) {
			if (chk == arr[i])
				arr[i] = -1;
			else {
				cnt++;
				chk = arr[i];
			}
		}
		
		int[] answer = new int[cnt];
		int num = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] != -1) 
				answer[num++] = arr[i];
		}
		
		return answer;
	}
}
