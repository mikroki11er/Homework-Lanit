import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik = new Kotik();
        Kotik kotik1 = new Kotik("Карл", 5, "Руаруру", 99);
        System.out.println(kotik.getWeow().equals(kotik1.getWeow()));
        System.out.println(kotik1.getName() + " весит " + kotik1.getWeight());
        kotik1.liveAnotherDay();
        System.out.println("У нас есть " + kotik.getCount() + " котика.");
    }
}