package lesson06;

public class Cat extends Animals {
    int maxRunDistance = 200;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int Distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }

    @Override
    public void run(int Distance) {

        if ((Distance >= 0) && (Distance <= maxRunDistance)) {
            System.out.println("Кот " + name + " пробегает " + Distance + "m.");
        } else {
            System.out.println("Кот " + name + " не пробежит " + Distance + "m" + ", он устанет");
        }
    }
}
