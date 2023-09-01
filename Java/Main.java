  import java.util.*;
   public class Main
    {  
     public static void main(String[] args)
     {  
      Scanner my=new Scanner(System.in);
      int i=1,fact=1;  
      System.out.println("Enter a no. ");
      int number=my.nextInt();
      while(i<=number)
      {    
          fact=fact*i; 
          i++;   
      }    
      System.out.println("Factorial of "+number+" is: "+fact);    
     }  
    }  
