interface Vehicle {
void changeGear(int a);
void speedup(int a);
void applyBrakes(int a);
void printStates();
}
class Bicycle implements Vehicle{
int speed=0;
int gear;
public void changeGear(int newGear){
gear = newGear;
}
public void speedup(int increment){
speed += increment;
}
public void applyBrakes(int decrement){
speed -= decrement;
}
public void printStates(){
System.out.println("Speed Of Bicycle : "+speed
+"km/hr\nGear : "+gear);
}
}
class Car implements Vehicle{
int speed=0;
int gear;
public void changeGear(int newGear){
gear = newGear;
}
public void speedup(int increment){
speed += increment;
}
public void applyBrakes(int decrement){
speed -= decrement;
}
public void printStates(){
System.out.println("Speed Of Car : "+speed
+"km/hr\nGear : "+gear+"\n");
}
}
class Bike implements Vehicle{
int speed=0;
int gear;
public void changeGear(int newGear){
gear = newGear;
}
public void speedup(int increment){
speed += increment;
}
public void applyBrakes(int decrement){
speed -= decrement;
}
public void printStates(){
System.out.println("Speed Of Bike: "+speed
+"km/hr\nGear : "+gear+"\n");
}
}
class Vehicles{
public static void main(String[] args){
Bicycle b1 = new Bicycle();
b1.changeGear(3);
b1.speedup(10);
b1.applyBrakes(5);
System.out.println("---------------------------");
System.out.println("Present State of Bicycle");
b1.printStates();
Car c1 = new Car();
c1.changeGear(3);
c1.speedup(60);
c1.applyBrakes(50);
System.out.println("---------------------------");
System.out.println("Present State of Car :");
c1.printStates();
Bike b2 = new Bike();
b2.changeGear(3);
b2.speedup(50);
b2.applyBrakes(45);
System.out.println("---------------------------");
System.out.println("Present State of Bike :");
b2.printStates();
}
}

