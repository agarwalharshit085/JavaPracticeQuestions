interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class FlyingFish implements Flyable, Swimmable {
    public void fly() {
        System.out.println("FlyingFish can fly for short distances.");
    }

    public void swim() {
        System.out.println("FlyingFish can also swim underwater.");
    }
}

public class MultipleInheritance{
    public static void main(String[] args) {

        FlyingFish f = new FlyingFish();

        f.fly();
        f.swim();
    }
}
