import java.util.*;

public class Checker
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int i, num;
        int flag = 0;
        int rem = 0;
        
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        
        for(i=2; i<=num/2; i++){
            rem = num % i;
            
            if(rem==0){
                flag = 1;
                break;
            }
            
        }

        if(flag == 1){
            System.out.println("It is not a prime number: "+num);
        }
        else{
            System.out.println("It is a prime number");
        }

        
    }
}
