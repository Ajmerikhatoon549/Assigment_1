import java.util.*;
public class start {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter word");
      String word=sc.nextLine();
     StringBuilder result = new StringBuilder ();
       char ch;
       int i=0;
       while(i<word.length()){
        ch= word.charAt(i);
        int count= word.charAt(i+1) -'0';
        i+=2;
       
        for(int j=0;j<count;j++){
            result.append(ch);
        }
      }
    
    System.out.println(result.toString());
         
    
       }

      }
     

