package Question7;

public class Car extends Vehicle{

   @Override
   public void speedup(int speed){
        System.out.println("car speed is increased");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.speedup(50);

    }
}
