import java.util.Scanner;

public class Homeof {
    public static void main(String[] args) {
        String name;
        // 1. Fixed typo: "Scanner" instead of "Scannner"
        Scanner out = new Scanner(System.in); 
        
        System.out.println("Enter the name:");
        name = out.nextLine();

        // 2. Fixed substring logic: Use (0, 1) and reassign to the variable
        if (name != null && name.length() > 0) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        // 3. Print the result to see the change
        System.out.println("Capitalized: " + name);
        
        out.close();
    }
}
