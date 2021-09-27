package Animals;
import Food.Meat;
import Food.Food;

public class Carnivorous extends Animal implements Run,Voice{


    @Override
    public void eat(Food food) {
        if (food instanceof Meat){
            System.out.println("Food is good.");
        } else System.out.println("cant eat");
    }

    @Override
    public void run() {

    }

    @Override
    public String voice() {
        return null;
    }
}
