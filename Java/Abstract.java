//abstract class and method stuff
abstract class Shape{
    abstract public void Compute_area(int a, int b);

    abstract public void Calculate_Area();//Declaring the method which is to be overriden ahead in the program
}

class Triangle extends Shape{
    public int base;
    public int height;
    public void Compute_area(int base, int height){
        this.base = base;
        this.height = height;
    }

    public void Calculate_Area(){
        System.out.println("Area of triangle is: "+(0.5*(base*height)));
    }
}

class Rectangle extends Shape{
    public int length;
    public int breadth;
    public void Compute_area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void Calculate_Area(){
        System.out.println("Area of rectangle is: "+(length*breadth));
    }
}

class Abstract{
    public static void main(String[] args) {
        Shape t1 = new Triangle();
        t1.Compute_area(5, 5);
        t1.Calculate_Area();

        Shape t2 = new Rectangle();
        t2.Compute_area(5, 5);
        t2.Calculate_Area();
    }
}

/*
 * OUTPUT
 * Area of triangle is: 12.5
Area of rectangle is: 25
 */
