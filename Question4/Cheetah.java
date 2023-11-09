package Question4;

public class Cheetah extends Animal{

    @Override
    public void move(){
        System.out.println("cheetah is running");
    }

    public static void main(String[] args) {
        Cheetah cheetah=new Cheetah();
        cheetah.move();
    }
}
