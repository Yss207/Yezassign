//Try catch and final block code
import java.util.*;

class tcf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.println("Exceptions stored in options 1-4.");
            System.out.println("Select option: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                 try {
                    int data = 50/0;
                 } catch (ArithmeticException e) {
                    System.out.println(e);
                 }
                break;

                case 2:
                 try {
                    String s = null;
                    System.out.println(s.length());
                 } catch (NullPointerException e) {
                    System.out.println(e);
                 }
                break;

                case 3:
                 try{
                    String s = "abc";
                    int i = Integer.parseInt(s);
                 } catch(NumberFormatException e){
                    System.out.println(e);
                 }
                break;

                case 4:
                 try{
                    int a[] = new int[5];
                    a[10] = 50;
                 } catch(ArrayIndexOutOfBoundsException e){
                    System.out.println(e);
                 }
                break;

            }
        }while(ch!=5);

    }
}