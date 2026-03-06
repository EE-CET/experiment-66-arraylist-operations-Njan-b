import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of items
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read items
        String[] itemsArray = scanner.nextLine().split(" ");
        
        // Create ArrayList and add items
        ArrayList<String> cart = new ArrayList<>();
        for (String item : itemsArray) {
            cart.add(item);
        }
        
        // Read search item
        String searchItem = scanner.nextLine();
        
        // Sort the items alphabetically
        Collections.sort(cart);
        
        // Print sorted items
        System.out.println("Sorted Items: " + cart);
        
        // Check if search item exists
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        scanner.close();
    }
}