package Animals;

public class Lynx extends Carnivorous{
    @Override
    public void run() {
        System.out.println("Lynx run on the wall.");
    }

    @Override
    public String voice() {
        String voice = "uaUUu";
        return voice;
    }
}
