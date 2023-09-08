//Complex numbers program
import java.util.*;

public class ComplexOp{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n1, n2, i1, i2;
    int n = 0;
    int i = 0;
    int ch;

    System.out.println("Enter real part of 1st complex no: ");
    n1 = sc.nextInt();

    System.out.println("Enter imaginary part of 1st complex no: ");
    i1 = sc.nextInt();

    System.out.println("Enter real part of 2nd complex no: ");
    n2 = sc.nextInt();

    System.out.println("Enter imaginary part of 2nd complex no: ");
    i2 = sc.nextInt();

    System.out.println("Operation list: 1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
    ch = sc.nextInt();

    switch (ch) {
        case 1:
            n = n1 + n2;
            i = i1 + i2;
            System.out.format("Addition of ((%d)+(%d)i) & ((%d)+(%di) = ((%d)+(%di))", n1, i1, n2, i2, n, i);
            break;

        case 2:
            n = n1 - n2;
            i = i1 - i2;
            System.out.format("Subtraction : ((%d)+(%d)i) - ((%d)+(%di) = ((%d)+(%di))", n1, i1, n2, i2, n, i);
            break;

        case 3:
            n = (n1*n2) - (i1*i2);
            i =  (n1*i2) + (n2*i1);
            System.out.format("Multiplication : [(%d)+(%d)i] x [(%d)+(%di] = [(%d)+(%di)]", n1, i1, n2, i2, n, i);
            break;

        case 4:
            n = (n1/n2);
            i = (i1/i2);
            System.out.format("Division : [(%d)+(%d)i] / [(%d)+(%di] = [(%d)+(%di)]", n1, i1, n2, i2, n, i);
            break;
    
        default:
            break;
     }
    }
}
