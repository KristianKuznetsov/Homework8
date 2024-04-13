import task1.Animal;
import task1.Dog;
import task1.Rabbit;
import task1.Tiger;
import taskStar.PrivateDog;

public class SolutionBuilder {
    public static void buildTaskOne() {
        System.out.println("\n\n            Задача 1\n");

        Animal animal1 = new Dog();
        animal1.voice();
        System.out.println("Реакция на траву:");
        animal1.eat("Grass");
        System.out.println("Реакция на мясо:");
        animal1.eat("Meat");
        System.out.println("Реакция на ???:");
        animal1.eat("???");
        System.out.println("\n\n");

        Animal animal2 = new Tiger();
        animal2.voice();
        System.out.println("Реакция на траву:");
        animal2.eat("Grass");
        System.out.println("Реакция на мясо:");
        animal2.eat("Meat");
        System.out.println("Реакция на ???:");
        animal2.eat("???");
        System.out.println("\n\n");

        Animal animal3 = new Rabbit();
        animal3.voice();
        System.out.println("Реакция на траву:");
        animal3.eat("Grass");
        System.out.println("Реакция на мясо:");
        animal3.eat("Meat");
        System.out.println("Реакция на ???:");
        animal3.eat("???");
        System.out.println("\n\n");
    }

//   Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//   Переопределить методы voice(), eat(String food) чтобы они выводили верную
//   информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
//
//   Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
//   туда “Grass” он должен написать в консоли что любит есть травку. Если передадим
//   “Meat” или другую строку то он будет недоволен.


    public static void buildTaskStar() {
        System.out.println("\n\n            Задача *\n");
        // Попытка создания объекта класса PrivateDog вызовет недовольство у java
        // PrivateDog dog = new PrivateDog();

        // Создание объекта класса PrivateDog через статический метод createInstance()
        PrivateDog dog = PrivateDog.createInstance();

        // Вызов методов voice() и eat() через объект dog
        dog.voice();
        dog.eat();

        //TODO: Запрещаем другим классам вызывать конструктор с помощью модификатора доступа,
        // обходим это с помощью другой публичной функции возвращающей обект класса, вместо конструктора,
        // с методами ничего не мутим, как вызывали от экземпляра класса так и продолжаем дальше

    }

//    Задача *:
//    Написать такой конструктор, который запретит создание объекта класса Dog в других
//    классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
//    обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
//    способа.

}
