package task1;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик пищит.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Grass")) {
            System.out.println("Кролик с радостью ест " + food + ".");
        } else {
            System.out.println("Кролик не ест " + food + ". Он предпочитает Grass.");
        }
    }
}
