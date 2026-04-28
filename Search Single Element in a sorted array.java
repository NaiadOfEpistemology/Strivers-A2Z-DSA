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
        for(int i=0;i<arr.size();i++){
            answer=answer^arr.get(i);
        }
        System.out.println(answer);
    }
}
