import java.util.Scanner;
public class charfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string ");
        String input = sc.nextLine();
        if (!input.matches("[a-z]{1,1000}")) {
            System.out.println("Invalid input.");
            return;
        }

        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                
                result.append(input.charAt(i - 1)).append(count);
                count = 1;
        }

        
        System.out.println("result " + result.toString());

        sc.close();
    }
    }
}
