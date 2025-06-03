import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            cards[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(cards);
        
        int m = Integer.parseInt(br.readLine());
        String[] checkInput = br.readLine().split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<m; i++){
            int target = Integer.parseInt(checkInput[i]);
            if(binarySearch(cards, target)){
                sb.append("1\n");
            }else{
                sb.append("0\n");
            }
        }
        System.out.println(sb.toString());
    }
    public static boolean binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == key) return true;
            else if (arr[mid]< key) left = mid+1;
            else right = mid - 1;
        }
        return false;
    }
}