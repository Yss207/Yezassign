//static or compile time polymorphism
//We will implement method overloading
public class Stuff{

    static int Mult(int a, int b){
        return a*b;
    }

    static float Mult(float a, float b, float c){
        return a*b*c;
    }


    public static void main(String[] args) {
       

        System.out.println(Mult(5, 6));
        System.out.println(Mult(5.0f, 1.0f, 2.5f));
    }
}