import java.util.*;
public class Main{
    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList<>();
        boolean f=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements. Enter a non integer to end");
        while(scanner.hasNextInt()){
            int num=scanner.nextInt();
            arr.add(num);
        }
        scanner.next();
        System.out.println("Enter element you want to find");
        int find=scanner.nextInt();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==find){
                System.out.println("index position : "+i);
                f=true;
            }
            
            }
            if(!f){
                System.out.println(-1);
        }
    }
}
