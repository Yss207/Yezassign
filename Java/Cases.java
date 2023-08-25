//Perform operations on two numbers using switch case
import java.util.*;

public class Cases{
       public static void main (String args[]){
          
          Scanner sc = new Scanner(System.in);
          
          int a, b, ch;
          int c = 0;
  
          do{
          
             System.out.println("Enter number A : ");
             a = sc.nextInt();
          
             System.out.println("Enter number B: ");
             b = sc.nextInt();
             
             System.out.println("Select your choice:\n1.Additon\n2.Subtraction\n3.Multiplication\n4.Division\n5. Exit\n");
             ch = sc.nextInt();
             switch (ch){
                     case 1: c = a + b;
                             System.out.println("Additon of "+a+" & "+b+" is: "+c);
                             break;
                             
                     case 2: c = a - b;
                             System.out.println("Subtraction of "+a+" & "+b+" is: "+c);
                             break;
                             
                     case 3: c = a * b;
                             System.out.println("Multiplication of "+a+" & "+b+" is: "+c);
                             break;
                             
                     case 4: c = a / b;
                             System.out.println("Division of "+a+" & "+b+" is: "+c);
                             break;
                             
                     }
               }while(ch!=5);
             }
}
