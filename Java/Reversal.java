import java.util.*;

public class Reversal
{
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        
        String Original;
        String reversed = "";//Empty string because it will be filled in the reverse order
        int i;
        
        System.out.println("Enter a string: ");
        Original = sc.nextLine();
        
        for(i = 0; i<Original.length(); i++){ 
            reversed = Original.charAt(i) + reversed;
        }
        
        System.out.println("Reversed string is: " + reversed);
    }
    
}
//Original.length basically calculates the number of letters in the string.
/*i will be less than length of string by one value because... let's see: ABCD - Length is 4. Indexing however will start from 0 and will end at 3. So, we are doing the stuff.
8*/
