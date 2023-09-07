//using new keyword here
public class newop {

    int a, b, c;

    newop(int x, int y) {
        a = x;
        b = y;
        c = a + b;
    }

    void display() {
        System.out.println("Addition of two numbers is: " + c);
    }

    public static void main(String[] args) {
        newop a1 = new newop(5, 10);// new keyword gets used here...
        a1.display();
    }
}
