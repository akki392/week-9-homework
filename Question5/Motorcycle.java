package Question5;

public class Motorcycle implements Vehicle{

    String make="Honda";
    String model="PCX";
    int year=2022;
    String Fueltype="petrol";
    @Override
    public void fuel_efficiency(){
        System.out.println("make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Fueltype : "+Fueltype);
        int mil1=100;
        int mil2=250;
        double gallons=10.20;
        System.out.println("FuelEfficiency : "+(mil2-mil1)/gallons);
    }
    @Override
    public void distance_traveled(){
        int mil1=100;
        int mil2=250;
        System.out.println("Distance travelled : "+(mil2-mil1));
    }
    @Override
    public void Maximum_speed(){
        int maxspeed=30;
        System.out.println("maximum speed : "+maxspeed);

    }

    public static void main(String[] args) {
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.fuel_efficiency();
        motorcycle.distance_traveled();
        motorcycle.Maximum_speed();
    }
}
