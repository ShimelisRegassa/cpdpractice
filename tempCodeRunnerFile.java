import java.util.Arrays;
import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] word = s.split("\\+");
              Arrays.sort(word);
        
        // 3. Join them back with "+"
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            result.append(word[i]);
            if (i < word.length - 1) {
                result.append("+");
            }
        }
        System.out.println(result.toString());
        scanner.close();
    }
}
