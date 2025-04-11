import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(char ch : a.toCharArray()){
            if(Character.isUpperCase(ch)){
                result+=Character.toLowerCase(ch);
            }
            else{
                result+=Character.toUpperCase(ch);
            }
        }
        System.out.println(result);
    }
}