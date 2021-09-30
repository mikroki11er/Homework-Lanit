import Animals.*;
import Food.Food;
import Food.Meat;
import Food.Grass;

public class Zoo {
    public static void main(String[] args) {
        Food grass = new Grass();
        Food meat = new Meat();
        Worker worker = new Worker();
        Animal fish = new Fish();
        Animal duck = new Duck();
        Animal cat = new Cat();
        Animal hyena = new Hyena();

        //worker.getVoice((Voice) fish);
        worker.getVoice((Voice) cat);

        worker.Feed(cat, meat);
        worker.Feed(hyena,grass);

        Swim[] pool = new Swim[2];
        pool[0] = (Swim) fish;
        pool[1] = (Swim) duck;
        for (int i = 0; i < pool.length; i++) {
            pool[i].swim();
        }
    }
}
