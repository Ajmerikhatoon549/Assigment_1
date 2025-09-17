 import java.util.*;
 public class primechecker{
 public static void main(String [] args){
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
}

