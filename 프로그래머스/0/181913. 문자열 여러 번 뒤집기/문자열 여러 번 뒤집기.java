import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            String change = answer.substring(start, end+1);
            StringBuilder changeAnswer = new StringBuilder(change).reverse();
            answer.replace(start, end+1, changeAnswer.toString());
        }
        return answer.toString();
    }
}