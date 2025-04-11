class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int result1 = 0;
        int result2 = 0;
        
        result1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        result2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a)); 
        if(result1>result2){
            answer+=result1;
        }else{
            answer+=result2;
        }
        return answer;
    }
}