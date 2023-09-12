//this keyword in java
public class usingthis {
    int a, b;

    void add(int a, int b) {
        int c;
        this.a = a;//this is used to refer to class variables declared in the class, not inside a function.
        this.b = b;
        c = this.a + this.b;

        System.out.println("Answer: " + c);
    }

    public static void main(String[] args) {
        usingthis c1 = new usingthis();
        c1.add(5, 10);
    }

}
