 import java.util.*;
 public class primechecker{
 public static void main(String [] args){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter number");
 int num = sc.nextInt();
 if(num<1){
    System.out.println("not a prime number");

 }
for(int i=2 ;i<num-1;i++){
 if(num%i==0){
    System.out.println("it is not a prime number");
    break;
 }
 else{
 System.out.println("it is a prime number");
}
 }
}
}

