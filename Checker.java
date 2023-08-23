import java.util.*;

public class Checker
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int i, num;
        int rem = 0;
        
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        for(i=1; i<=num; i++){
            rem = num % i;
            
        }
            if(rem == 0){
               System.out.println("Entered value is prime number");
            }else{
               System.out.println("Not prime");
            }
         
     }
}
