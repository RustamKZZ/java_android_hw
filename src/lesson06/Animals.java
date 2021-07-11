package lesson06;

public abstract class Animals {
    String name;
    String color;
    int age;
    final int maxRunDistance = 0;
    final int maxSwimDistance = 0;

    public abstract void run(int Distance);

    public abstract void swim(int Distance);

    public void info() {
        System.out.printf("%s %s  %d\n", name, color, age);
    }

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
