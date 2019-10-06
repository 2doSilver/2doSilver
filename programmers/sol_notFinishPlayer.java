package algorithmStudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sol_notFinishPlayer {
	public static void main(String args[]) {
		System.out.println(solution1(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
	}
	
    public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> partMap = new HashMap<>();
        Map<String, Integer> compMap = new HashMap<>();
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i<completion.length; i++) {
        	if (!participant[i].equals(completion[i])) {
        		answer = participant[i];
        		return answer;
        	}
        }
        
        answer = participant[completion.length];
        
        return answer;
    }
    
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> partMap = new HashMap<>();
        Map<String, Integer> compMap = new HashMap<>();
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0; i<participant.length; i++) 
        	partMap.put(participant[i], i);
        
        for (int i=0; i<completion.length; i++) 
        	compMap.put(completion[i], i);
        
        for (int i=0; i<participant.length; i++) {
        	if (!partMap.get(participant[i]).equals(compMap.get(participant[i])))
        		return participant[i];
        		
        }
        
        return answer;
    }
}
