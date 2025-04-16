import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        //리스트로 만들어야 원소들을 자유롭게 추가, 삭제 가능하다
        List<Integer> answer = new ArrayList<>(); 
        
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
            if (i == num_list.length - 1) {
                
                if (num_list[i - 1] < num_list[i]) {
                    answer.add(num_list[i] - num_list[i - 1]);
                } else {
                    answer.add(num_list[i] * 2);
                }
             } //else {
            //     answer.add(num_list[i]);
            // }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}