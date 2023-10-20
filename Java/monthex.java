import java.util.*;
public class monthex {
    public void checkmon(int i) throws NumberFormatException{
        if(i<1 || i>12){
            throw new NumberFormatException("\nException occured");
        }else{
            System.out.println("Correct month number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter month no: ");
        m = sc.nextInt();

        monthex obj = new monthex();
        obj.checkmon(m);

        System.out.println("THE REST");
        
    }
}
