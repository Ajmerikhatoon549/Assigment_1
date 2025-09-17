import java.util.Scanner;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        int[] freq = new int[256]; // For all ASCII characters
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);

            // index from the left
            while (freq[currentChar] > 0) {
                freq[s.charAt(left)]--;
                left++;
            }

            // Include current character in the index
            freq[currentChar]++;
            int windowLength = right - left + 1;
            if (windowLength > maxLength) {
                maxLength = windowLength;
            }

            right++;
        }

        System.out.println("Length of longest substring: " + maxLength);
        scanner.close();
    }
}
