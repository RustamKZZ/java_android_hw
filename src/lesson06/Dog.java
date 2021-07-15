package lesson06;

public class Dog extends Animals {
    final int maxRunDistance = 500;
    final int maxSwimDistance = 10;
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int Distance) {
        if ((Distance >= 0) && (Distance <= maxRunDistance)) {
            System.out.println("Собака " + name + " пробегает " + Distance + "m");
        } else {
            System.out.println("Собака " + name + " не пробежит " + Distance + "m" + ", устанет");
        }
    }

    @Override
    public void swim(int Distance) {
        if ((Distance >= 0) && (Distance <= maxSwimDistance)) {
            System.out.println("Собака " + name + " проплывает " + Distance + "m");
        } else {
            System.out.println("Собака " + name + " не проплывет " + Distance + "m");
        }
    }
}
