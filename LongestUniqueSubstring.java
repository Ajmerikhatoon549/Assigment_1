import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));

            
            maxLength = Math.max(maxLength, i - left + 1);
        }

        System.out.println("Length of longest substring : " + maxLength);

        scanner.close();
    }
}
