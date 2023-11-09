package Question5;

public class Truck implements Vehicle {
    String make="peagout";
    String model="Tatra 810";
    int year=2020;
    String Fueltype="petrol";
    @Override
    public void fuel_efficiency(){
        System.out.println("make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Fueltype : "+Fueltype);
        int mil1=600;
        int mil2=800;
        double gallons=40;
        System.out.println("FuelEfficiency : "+(mil2-mil1)/gallons);
    }
    @Override
    public void distance_traveled(){
        int mil1=600;
        int mil2=800;
        System.out.println("Distance travelled : "+(mil2-mil1));
    }
    @Override
    public void Maximum_speed(){
        int maxspeed=50;
        System.out.println("maximum speed : "+maxspeed);

    }

    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.fuel_efficiency();
        truck.distance_traveled();
        truck.Maximum_speed();
    }

}
