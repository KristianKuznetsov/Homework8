package task1;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Собака с удовольствием ест " + food + ".");
        } else {
            System.out.println("Собака не ест " + food + ". Она предпочитает Meat.");
        }
    }
}
