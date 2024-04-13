package task1;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр рычит.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Тигр наслаждается " + food + ".");
        } else {
            System.out.println("Тигр отказывается есть " + food + ". Он ест только Meat.");
        }
    }
}