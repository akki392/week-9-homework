package Question7;

public class Vehicle {

    public void speedup(int speed){
        System.out.println("Vehicle speed");
    }

    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.speedup(20);

    }
}
