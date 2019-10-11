package algorithmStudy;

public class sol_HarshadNum {
	  public boolean solution(int x) {
	      String num = Integer.toString(x);
	      int[] sepNum = new int[num.length()];
	      
	      for(int i=0; i<num.length(); i++) {
	    	  sepNum[i] = Integer.parseInt(num.substring(i, i+1));
	      }
	      
	      int sum = 0;
	      
	      for (int i=0; i<sepNum.length; i++) {
	    	  sum += sepNum[i];
	      }
	      
	      if (x % sum == 0) 
	    	  return true;
	      else 
	    	  return false;
	  }
}
