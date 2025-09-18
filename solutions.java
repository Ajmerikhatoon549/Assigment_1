import java.util.*;
public class solutions{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose  1 to 5 ");
        System.out.println("1. Expanding a Charater:");
        System.out.println("2.Check  Character Frequency:");
        System.out.println("3.Check prime number:");
        System.out.println("4. Convert Number to words:");
        System.out.println("5. finding longest unique frequency");
        int n=sc.nextInt();
        switch(n){
            case 1: expand();
                    break;
            case 2: frequency();
                    break;
            case 3: check();
                    break;
            case 4: Words();
                      break;
            case 5: Substring();
                    break;
           default: System.out.println("Invalid Input please read instructions carefully");
           
        }
    }
public static void expand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = sc.nextLine();
        String result = "";  

        char ch;
        int i = 0;
        while (i < word.length()) {
            ch = word.charAt(i);
            int count = word.charAt(i + 1) - '0';  
            i += 2;

            for (int j = 0; j < count; j++) {
                result += ch;  
            }
        }

        System.out.println(result);
    }

       public static void frequency() {
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
     public static void check(){
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter Number");
 int Num = sc.nextInt();//taking input
 if(Num<1){//if number is negative integer
    System.out.println(" It is not a prime Number:");

 }
for(int i=2 ;i<Num-1;i++){
 if(Num%i==0){//is divisibe or not
    System.out.println("it is not a prime Number");
    break;
 }
 else{
 System.out.println("it is a prime number");
}
 }
}
public static void Words(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num=sc.nextInt();// for user input
    if(num<1 || num>1000){//for checking range
        System.out.println("Invalid Number");
    }
    else{
    int a=num%10;//last digit
    int b=num/10;
    int c=b%10;//middle digit
    int d=num/100;//first digit
    String ones[]={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
    String tens[]={" ","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
    String hundreds="hundred";
    if(num<20)//ones number
        System.out.println(ones[num]);
    else if(num>=20 && num<=100)//tens number
    System.out.println(tens[c]+" "+ones[a]);
    else //hundreds number
    System.out.println(ones[d]+" "+hundreds+" "+tens[c]+" "+ones[a]);
    }

}
 public static void Substring() {
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







      
     



