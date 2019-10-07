package algorithmStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sol_bp {
    public int[] solution(int[] answers) {
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int oneScore = 0;
        int twoScore = 0; 
        int threeScore = 0;
        
        List<Integer> array = new ArrayList<>();
        
        for (int i=0; i<answers.length; i++) {
        	if (answers[i] == one[i%5])
        		oneScore++;
        	if (answers[i] == two[i%8])
        		twoScore++;
        	if (answers[i] == three[i%10])
        		threeScore++;
        }

        if (oneScore > twoScore) {
        	if (oneScore > threeScore) {
        		array.add(1);
        	}
        	else if (oneScore == threeScore) {
        		array.add(1);
        		array.add(3);
        	}
        	else if (threeScore > oneScore) {
        		array.add(3);
        	}
        } else if (oneScore == twoScore) {
        	if (oneScore > threeScore) {
        		array.add(1);
        		array.add(2);
        	}
        	else if (threeScore > oneScore) {
        		array.add(3);
        	}
        	else if (threeScore == oneScore) {
        		array.add(1);
        		array.add(2);
        		array.add(3);
        	}
        } else if (twoScore > oneScore) {
        	if (twoScore > threeScore) {
        		array.add(2);
        	} else if (threeScore == twoScore) {
        		array.add(2);
        		array.add(3);
        	} else if (threeScore > twoScore) {
        		array.add(3);
        	}
        }

        int[] answer = new int[array.size()];
        
        for (int i = 0; i < array.size(); i++) {
        	answer[i] = array.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
