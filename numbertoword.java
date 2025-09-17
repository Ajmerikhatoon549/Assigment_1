import java.util.*;
public class numbertoword{
public static void main(String[] args){
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
    String tens[]={" ","ten","twenty","thirty","fouty","fifty","sixty","seventy","eighty","ninty"};
    String hundreds="hundred";
    if(num<20)//ones number
        System.out.println(ones[num]);
    else if(num>=20 && num<=100)//tens number
    System.out.println(tens[c]+" "+ones[a]);
    else //hundreds number
    System.out.println(ones[d]+" "+hundreds+" "+tens[c]+" "+ones[a]);
    }

}
}