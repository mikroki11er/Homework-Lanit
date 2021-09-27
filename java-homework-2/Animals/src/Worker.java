import Animals.Animal;
import Animals.Voice;
import Food.Food;


public class Worker {
    public void Feed(Animal animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
