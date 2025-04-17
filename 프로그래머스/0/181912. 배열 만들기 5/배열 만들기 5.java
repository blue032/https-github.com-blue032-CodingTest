import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i <intStrs.length; i++){
            int change = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(change>k){
                answer.add(change);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}