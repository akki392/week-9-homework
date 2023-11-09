package Question6;

public class Cat extends Animal {
    @Override
    public void Sound() {
        System.out.println("The cat meows");
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.Sound();
    }
}
