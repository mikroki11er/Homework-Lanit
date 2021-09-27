package model;

public class Kotik {
    private int hunger;
    private static int count;
    private String name;
    private int weight;
    private String weow;
    private int prettiness;


    public int getCount(){
        return count;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getWeow() {
        return weow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public Kotik(String name, int weight, String weow, int prettiness) {
        this.name = name;
        this.weight = weight;
        this.weow = weow;
        this.prettiness = prettiness;
        this.count += 1;
        this.hunger = 50;
    }

    public Kotik(){
        this.name = "Кот " + count;
        this.weight = (int) (Math.random()*20);
        this.weow = "weow";
        this.prettiness = (int) (Math.random()*100);
        this.count += 1;
        this.hunger = 50;
    }

    private boolean eat(int countOfFood){
        this.hunger += countOfFood;
        return true;
    }

    private boolean eat(int countOfFood, String nameOfFood){
        this.hunger += countOfFood;
        return true;
    }

    private boolean eat(){
        eat(10,"Вискас");
        return true;
    }

    private boolean makeASound(){
        if (this.hunger > 0){
            System.out.println(getName() + ": " + getWeow());
            this.hunger -= 7;
            return true;
        } else {
            System.out.println("Котик слишком голоден что бы мяукать, пошел перекусить.");
            return false;
        }
    }

    private boolean chaseMouse(){
        if (this.hunger > 0){
            System.out.println(getName() + ": погнался за мышкой");
            this.hunger -= 14;
            return true;
        } else {
            System.out.println("Котик слишком голоден что бы бегать за мышкой, пошел перекусить.");
            return false;
        }
    }

    private boolean sleep(){
        if (this.hunger > 0){
            System.out.println(getName() + ": уснул.");
            this.hunger -= 5;
            return true;
        } else {
            System.out.println("Котик слишком голоден что бы уснуть, пошел перекусить.");
            return false;
        }
    }

    private boolean play(){
        if (this.hunger > 0){
            System.out.println(getName() + ": решил поиграть.");
            this.hunger -= 20;
            return true;
        } else {
            System.out.println("Котик слишком голоден что бы играть, пошел перекусить.");
            return false;
        }

    }

    public void liveAnotherDay(){
        int i = 0;
        do {
            i+=1;
            switch ((int) (Math.random()*4)){
                case (0):
                    if (makeASound() == true){
                        break;
                    } else
                    eat();
                    break;

                case (1):
                    if (chaseMouse() == true){
                        break;
                    } else
                    eat();
                    break;

                case (2):
                    if (sleep() == true){
                        break;
                    } else
                    eat();
                    break;

                case (3):
                    if (play() == true){
                        break;
                    } else
                    eat();
                    break;

            }
        } while (i < 24);
    }

//    public void liveAnotherDay(){
//        for (int i = 0; i < 24; i++) {
//            switch ((int) (Math.random()*4)){
//                case (0):
//                    if ( hunger > 0) {
//                        makeASound();
//                        break;
//                    } else
//                        makeASound();
//                    eat();
//                    i += 1;
//                    break;
//                case (1):
//                    if ( hunger > 0)
//                    {
//                        chaseMouse();
//                        break;
//                    } else
//                        chaseMouse();
//                    eat();
//                    i += 1;
//                    break;
//                case (2):
//                    if ( hunger > 0)
//                    {
//                        sleep();
//                        break;
//                    } else
//                        sleep();
//                    eat();
//                    i += 1;
//                    break;
//                case (3):
//                    if ( hunger > 0)
//                    {
//                        play();
//                        break;
//                    } else
//                        play();
//                    eat();
//                    i += 1;
//                    break;
//            }
//        }
//    }
}