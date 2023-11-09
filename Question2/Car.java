package Question2;

public class Car extends Vehicle{

    @Override
    public void drive(){
        System.out.println("repairing a car");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.drive();
    }
}
