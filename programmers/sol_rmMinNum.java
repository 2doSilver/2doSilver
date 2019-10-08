package algorithmStudy;

import java.util.Arrays;

public class sol_rmMinNum {
	  public int[] solution(int[] arr) {
	      if (arr.length-1 == 0) {
	    	  return new int[] {-1};
	      }
	      
	      int[] answer = new int[arr.length-1];
	      int[] arrCopy = Arrays.copyOf(arr, arr.length);
	      
	      Arrays.sort(arrCopy);
	      
	      int answerCnt = 0;
	      
	      for (int i=0; i<arr.length; i++) {
	    	  if (arr[i] != arrCopy[0])
	    		  answer[answerCnt++] = arr[i]; 
	      }
	      
	      return answer;
	  }
}
