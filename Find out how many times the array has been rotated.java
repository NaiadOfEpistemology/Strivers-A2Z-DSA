import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array elements. Enter a non integer to end:");
        while (scanner.hasNextInt()) {
            arr.add(scanner.nextInt());
        }
        if (arr.isEmpty()) return;
        int minIndex = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                minIndex = i;
                break;
            }
        }
        System.out.println("The array was rotated " + minIndex + " times.");
        List<Integer> firstPart = arr.subList(minIndex, arr.size());
        List<Integer> secondPart = arr.subList(0, minIndex);
        List<Integer> unrotated = new ArrayList<>(firstPart);
        unrotated.addAll(secondPart);

        System.out.println("Unrotated array: " + unrotated);
    }
}
