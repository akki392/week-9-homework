package Question9;

public class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("Bird fly");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    public static void main(String[] args) {
     Bird bird=new Bird();
     bird.move();
     bird.makeSound();
    }
}
