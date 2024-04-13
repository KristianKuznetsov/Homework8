package taskStar;

public class PrivateDog {
    private PrivateDog() {
        // Приватный конструктор класса PrivateDog
        //ля ля ля     ля    ля ля ля
    }

    public static PrivateDog createInstance() {
        return new PrivateDog();
    }

    public void voice() {
        System.out.println("Собака лает.");
    }

    public void eat() {
        System.out.println("Собака ест.");
    }
}
