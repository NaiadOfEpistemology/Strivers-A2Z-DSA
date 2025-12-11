import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={3, 4, 13, 13, 13, 20, 20, 40};
        int x=20, count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}
