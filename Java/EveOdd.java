import java.util.*;

public class EveOdd
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        int rem = 0;
        int num;
        
        System.out.println("Enter a number to check whether it is even or odd: ");
        num = sc.nextInt();
        
        if(num%2 == 0){
            System.out.println("The number " + num + " is an even number");
        }else{
            System.out.println("The number " + num + " is an odd number");
        }
     }
}
