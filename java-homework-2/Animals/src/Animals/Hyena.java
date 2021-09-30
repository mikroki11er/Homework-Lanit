package Animals;

public class Hyena extends Carnivorous {
    @Override
    public void run() {
        System.out.println("Hyena run to the wood.");
    }

    @Override
    public String voice() {
        String voice = "eHeHeHe";
        return voice;
    }
}
