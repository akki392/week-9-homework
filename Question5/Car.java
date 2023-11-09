package Question5;

public class Car implements Vehicle {
    String make="BMW";
    String model="X5";
    int year=2020;
    String Fueltype="petrol";
@Override
    public void fuel_efficiency(){
        System.out.println("make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Fueltype : "+Fueltype);
    int mil1=250;
    int mil2=500;
    double gallons=40;
        System.out.println("FuelEfficiency : "+(mil2-mil1)/gallons);
    }
    @Override
    public void distance_traveled(){
        int mil1=250;
        int mil2=500;
        System.out.println("Distance travelled : "+(mil2-mil1));
    }
    @Override
    public void Maximum_speed(){
    int maxspeed=70;
        System.out.println("maximum speed : "+maxspeed);

    }

    public static void main(String[] args) {
      Car car=new Car();
      car.fuel_efficiency();
      car.distance_traveled();
      car.Maximum_speed();
    }
}
