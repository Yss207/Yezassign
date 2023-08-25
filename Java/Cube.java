//Cube of any number
import java.util.*;

public class Cube{
       public static void main (String args[]){
          
          Scanner sc = new Scanner(System.in);
          
          int i, num;
          int ans = 0;
          
          System.out.println("Enter a number: ");
          num = sc.nextInt();
          
          ans = num*num*num;
          
          System.out.println("The cube of "+num+" is: "+ans);
      }
}  
