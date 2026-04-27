import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
        boolean f=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements. Enter a non integer to end");
        while(scanner.hasNextInt()){
            int num=scanner.nextInt();
            arr.add(num);
        }
        scanner.next();
        // Collections.sort(arr);
        // System.out.println("Min : "+arr.get(0)+"Max : "+arr.get(arr.size()-1));
        int min=arr.get(0);
        int max=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min=arr.get(i);
            }
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        System.out.println("Min : "+min+" "+"Max : "+max);
	}
}
