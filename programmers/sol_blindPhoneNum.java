package algorithmStudy;

public class sol_blindPhoneNum {
	  public String solution(String phone_number) {
	      String answer = "";
	      int phoneNumLen = phone_number.length();
	      String front = "";
	      String back = phone_number.substring(phoneNumLen-4, phoneNumLen);
	      
	      for (int i=0; i<phoneNumLen-back.length(); i++) {
	    	  front += "*";
	      }
	      
	      answer = front + back;
	      
	      return answer;
	  }
}
