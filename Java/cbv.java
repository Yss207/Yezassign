//Add 2 nums with the help of call by value
class Operation {
    int a, b;

    public static int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Numbers are: " + a + " & " + b);
        int c = add(a, b);

        System.out.println("Addition of the numbers is: " + c);
    }

}