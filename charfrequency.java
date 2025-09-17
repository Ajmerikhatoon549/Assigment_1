import java.util.Scanner;

public class charfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();//user input

        
        if (!input.matches("[a-z]{1,1000}")) {//checking range
            System.out.println("Invalid input");
            //sc.close();
            return;
        }

        String result = "";//empty result
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                // Add current character and its count to result
                result = result + input.charAt(i - 1) + count;
                count = 1;
            }
        }

        System.out.println("Result " + result);
        sc.close();
    }
}
