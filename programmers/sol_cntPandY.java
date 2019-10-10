package algorithmStudy;

public class sol_cntPandY {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;
        
        for (int i=0; i<s.length(); i++) {
        	char word = s.charAt(i);
        	
        	if (word == 'p' || word == 'P')
        		cntP++;
        	else if (word == 'y' || word == 'Y')
        		cntY++;
        }
        
        if (cntP == 0 && cntY == 0)
        	return true;
        else if (cntP == cntY)
        	return true;
        else
        	return false;
    }
}
