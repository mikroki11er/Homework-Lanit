package Animals;
import Food.Grass;
import Food.Food;

public class Herbivore extends Animal{
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            System.out.println("Food is good.");
        } else System.out.println("cant eat");
    }
}
