import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){
            if(stk.isEmpty()){
                stk.add(arr[i]);
            }
            else{
                if(stk.get(stk.size() - 1) < arr[i]){
                    stk.add(arr[i]);
                }
                else{
                    stk.remove(stk.size() - 1);
                    i--;
                }
            }
        }
        return stk.stream().mapToInt(i->i).toArray();
    }
}