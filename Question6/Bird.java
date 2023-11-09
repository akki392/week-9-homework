package Question6;

public class Bird extends Animal {
        @Override
        public void Sound() {
            System.out.println("The bird chirps");
        }

    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.Sound();
    }
    }

