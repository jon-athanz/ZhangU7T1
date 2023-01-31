import java.util.ArrayList;
public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Barry");
        Cat cat2 = new Cat("Henry");
        Cat cat3 = new Cat("Winnie");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        Cat cat4 = new Cat("Jonathan");
        Cat replaced = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replaced);

        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        System.out.println(cats);

    }
}
