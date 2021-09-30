package Animals;

public class Fish extends Herbivore implements Swim{
    @Override
    public void swim() {
        System.out.println("Fish swiming in the pool.");
    }
}
