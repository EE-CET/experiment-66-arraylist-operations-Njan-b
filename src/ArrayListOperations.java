import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<String> items = new ArrayList<>();

        String[] inputItems = sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            items.add(inputItems[i]);
        }

        String searchItem = sc.nextLine();

        Collections.sort(items);

        System.out.println("Sorted Items: " + items);

        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}