import java.util.*;

public class Fact
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        int i, num;
        int fact = 1;
        
        System.out.println("Enter a number whose factorial you want: ");
        num = sc.nextInt();
        
        for(i=1; i<=num; i++){
              fact *= i;
        }
        
        System.out.println("Value of "+ num +" factorial is: "+ fact);
     }
}
        
        
     
