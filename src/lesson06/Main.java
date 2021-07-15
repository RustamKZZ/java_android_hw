package lesson06;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Кузя", "черный", 7);

        cat.info();
        cat.run(250);
        cat.swim(1);

        Dog dog = new Dog("Сэм", "черный", 5);

        dog.info();
        dog.run(500);
        dog.swim(11);


    }


}
