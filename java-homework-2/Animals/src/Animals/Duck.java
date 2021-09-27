package Animals;

public class Duck extends Herbivore implements Fly,Swim,Voice{
    @Override
    public void Fly() {
        System.out.println("Duck can fly near.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swiming in the pool.");

    }

    @Override
    public String voice() {
        String voice = "Kria";
        return voice;
    }
}
