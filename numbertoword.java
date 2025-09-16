import java.util.*;
public class numbertoword{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter number");
    int num=sc.nextInt();
    if(num<1 || num>1000){
        System.out.println("invalid number");
    }
    else{
    int a=num%10;
    int b=num/10;
    int c=b%10;
    int d=num/100;
    String ones[]={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
    String tens[]={" ","ten","twenty","thirty","fouty","fifty","sixty","seventy","eighty","ninty"};
    String hundreds="hundred";
    if(num<20)
        System.out.println(ones[num]);
    else if(num>=20 && num<=100)
    System.out.println(tens[c]+" "+ones[a]);
    else 
    System.out.println(ones[d]+" "+hundreds+" "+tens[c]+" "+ones[a]);
    }

}
}