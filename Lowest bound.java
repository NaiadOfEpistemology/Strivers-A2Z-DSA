import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={3,5,8,15,19};
        int x=9, ind=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=x){
                ind=i;
                break;
            }
        }
        if(ind!=-1){
            System.out.println("Lowest bound : "+arr[ind]);
        }
        else{
            System.out.println("All elements are smaller");
        }
        
    
    }
}
