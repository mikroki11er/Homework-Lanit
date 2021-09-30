package Animals;

public class Cat extends Carnivorous implements Voice{
    @Override
    public void run() {
        System.out.println("Cat tun away.");
    }

    @Override
    public String voice() {
        String voice = "miau";
        return voice;
    }

}
