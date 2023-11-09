package Question9;

public class Panthera extends Animal{
    @Override
    public void move() {
        System.out.println("Panthera walk");
    }

    @Override
    public void makeSound() {
        System.out.println("Panthera roars");
    }

    public static void main(String[] args) {
     Panthera panthera=new Panthera();
     panthera.move();
     panthera.makeSound();
    }
}
