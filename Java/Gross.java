//Program to calculate gross salary
import java.util.*;

class Gross{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        double bp, da, hra, pf, club, gross, net;

        System.out.println("Enter Basic Pay: ");
        bp = sc.nextInt();

        da= 0.97 * bp;
        hra = 0.10 * bp;
        pf = 0.12 * bp;
        club = 0.001 * bp;

        gross = bp + da + hra;

        System.out.println("Gross salary is: "+gross);

        net = gross - pf - club;

        System.out.println("Net Salary is: "+net);
    }
    
}