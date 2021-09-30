package Animals;

public class Antelope extends Herbivore implements Run,Voice{
    @Override
    public void run() {
        System.out.println("Antelope run near the wall.");
    }

    @Override
    public String voice() {
        String voice = "eaaaaaaHH";
        return voice;
    }
}
