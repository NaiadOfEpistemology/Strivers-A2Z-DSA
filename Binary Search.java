import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=8, low=0, high=arr.length-1;
        
        while(low <= high){
            int mid = (low + high) / 2;  
            
            if(arr[mid] == target){
                System.out.println("Found at index " + mid);
                return;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
        System.out.println("Not found");
    }
}
