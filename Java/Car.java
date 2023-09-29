import java.util.*;

interface vehicle {
    void gear_change(int a);
    void speed_up();
    void apply_brakes();
    void display();
}

class Bicycle implements vehicle{
    int speed, gear;
    
    Scanner sc = new Scanner(System.in);
    Bicycle(){
        System.out.println("Bicycle has been started!!");
        speed = 10;
        gear = 1;
    }

    public void gear_change(int gear_c){
        if(gear_c>0 && gear_c<6){
            gear = gear_c;
        }
        else{
            System.out.println("Enter valid gears(1-5)");
        }
    }

    public void speed_up(){
        if(speed>0 && speed<=60){
            speed += 5;
            System.out.println("Current speed is: "+speed);
        }
        else{
            System.out.println("Max speed is: 60km/hr");
        }
    }

    public void apply_brakes(){
        int x;

        System.out.println("1. Decrease speed\n2.Stop vehicle");
        x = sc.nextInt();

        if(x==1){
            speed -= 5;
            
        }

    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
}