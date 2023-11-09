package Question9;

public class Animal {
    public void move() {
        System.out.println("Animal moves");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public static void main(String[] args) {
     Animal animal=new Animal();
     animal.move();
     animal.makeSound();
    }
}
