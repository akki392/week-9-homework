package Question7;

public class Bicycle extends Vehicle{

    @Override
    public void speedup(int speed){
        System.out.println("bicycle speed is increased");
    }

    public static void main(String[] args) {
        Bicycle bicycle=new Bicycle();
        bicycle.speedup(30);

    }
}
