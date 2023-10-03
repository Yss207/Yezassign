//creating Student class

class Student {
    String name;
    int roll_no;
    double sgpa;

    Student(String n, int roll_no, double sgpa) {
        name = n;
        this.roll_no = roll_no;
        this.sgpa = sgpa;
    }

    void display() {
        System.out.println("Student name: " + name + "\nRoll No: " + roll_no + "\nSGPA: " + sgpa);
    }
}

class Main {
    public static void main(String[] args) {
        Student obj[] = new Student[3];

        obj[0] = new Student("Yash", 64, 10.0);
        obj[1] = new Student("Stupid", 65, 9.5);
        obj[2] = new Student("Donkey", 66, 3.5);

        System.out.println("Student 1: \n");
        obj[0].display();

        System.out.println("Student 2: \n");
        obj[1].display();

        System.out.println("Student 3: \n");
        obj[2].display();

    }
}
