public class recurse {

    public static int add(int x, int y) {
        int result = 0;
        if (y == 0) {
            return x;
        } else {
            result = 1 + add(x, y - 1);/*
                                        * recursion takes place here --> 2nd term goes on becoming zero whereas 1 gets
                                        * added to result the same no of times what the value of y is at the start.
                                        * When y==0, x gets returned, whereas the 1's added in the result also get
                                        * returned in the sum variable below
                                        */
            return result;
        }

    }

    public static void main(String[] args) {
        int sum = add(5, 10);
        System.out.println(sum);

    }
}
