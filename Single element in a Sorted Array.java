import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements. Enter a non integer to end:");
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }
        int answer=0;
        for(int i=1;i<arr.size()-1;i++){
            if(arr.get(i-1)<arr.get(i) && arr.get(i+1)<arr.get(i)){
                answer=arr.get(i);
                break;
            }
        }
        System.out.println(answer);
    }
}
