//Big program to calculate gross salary and net salary
import java.util.*;

class Employee{
    int id;
    long mobile_no;
    String name, mail_id, address;
    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.println("Enter Employee Mobile No: ");
        mobile_no = sc.nextLong();

        sc.nextLine();

        System.out.println("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.println("Enter Employee Mail ID: ");
        mail_id = sc.nextLine();

        System.out.println("Enter address of Employee: ");
        address = sc.nextLine();

    }

    void display(){
        System.out.println("-----------------*******--------------");
        System.out.println("Employee ID: "+id);
        System.out.println("Employee name is :"+name);
        System.out.println("Employee Mobile no is:"+mobile_no);
        System.out.println("Employee mail id is: "+mail_id);
        System.out.println("Employee address is: "+address);
        System.out.println("-----------------*******--------------");
    }
}

class Programmer extends Employee{
    double gross_sal;
    double net_sal;
    double bp, hra, club, pf, da;

    void programsal(){
        System.out.println("Enter your basic pay:");
        bp = sc.nextDouble();

        da = (0.97*bp);
        hra = (0.10*bp);
        pf = (0.12*bp);
        club = (0.001*bp);

        gross_sal = bp + da + hra;

        net_sal = gross_sal - (pf + club);

        System.out.println("Gross salary: "+gross_sal);
        System.out.println("Net salary: "+net_sal);
    }
}

class TeamLead extends Employee{
    double gross_sal;
    double net_sal;
    double bp, hra, club, pf, da;

    void teamlaedsal(){
        System.out.println("Enter your basic pay:");
        bp = sc.nextDouble();

        da = (0.97*bp);
        hra = (0.10*bp);
        pf = (0.12*bp);
        club = (0.001*bp);

        gross_sal = bp + da + hra;

        net_sal = gross_sal - (pf + club);

        System.out.println("Gross salary: "+gross_sal);
        System.out.println("Net salary: "+net_sal);
    }
}

class AsstMan extends Employee{
    double gross_sal;
    double net_sal;
    double bp, hra, club, pf, da;

    void asstmansal(){
        System.out.println("Enter your basic pay:");
        bp = sc.nextDouble();

        da = (0.97*bp);
        hra = (0.10*bp);
        pf = (0.12*bp);
        club = (0.001*bp);

        gross_sal = bp + da + hra;

        net_sal = gross_sal - (pf + club);

        System.out.println("Gross salary: "+gross_sal);
        System.out.println("Net salary: "+net_sal);
    }
}

class Projman extends Employee{
    double gross_sal;
    double net_sal;
    double bp, hra, club, pf, da;

    void projmansal(){
        System.out.println("Enter your basic pay:");
        bp = sc.nextDouble();

        da = (0.97*bp);
        hra = (0.10*bp);
        pf = (0.12*bp);
        club = (0.001*bp);

        gross_sal = bp + da + hra;

        net_sal = gross_sal - (pf + club);

        System.out.println("Gross salary: "+gross_sal);
        System.out.println("Net salary: "+net_sal);
    }
}

class Salary{
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Select the choice as per your respective Designation: ");
        System.out.println("1. Programmer\n2.Team Lead\n3.Assistant Project Manager\n4.Project Manager");

        ch = sc.nextInt();

        switch(ch){
            case 1: 
              Programmer obj = new Programmer();
              obj.getdata();
              obj.display();
              obj.programsal();
            break;

            case 2: 
              TeamLead obj2 = new TeamLead();
              obj2.getdata();
              obj2.display();
              obj2.teamlaedsal();
            break;

            case 3: 
              AsstMan obj3 = new AsstMan();
              obj3.getdata();
              obj3.display();
              obj3.asstmansal();
            break;

            case 4: 
              Projman obj4 = new Projman();
              obj4.getdata();
              obj4.display();
              obj4.projmansal();
            break;
              
        }

    }
}