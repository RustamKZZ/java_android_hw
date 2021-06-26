package lesson01;

public class MainClass {
    public static void main(String[] args) {
        isVariable();
        System.out.println("ИТОГО: " + calculate(5, 4, 3, 2));
        System.out.println(task10and20(5, 6));
        isPositiveOrNegative(45);
        System.out.println(isNegative(-5));
        greetings("Java");
        isYears(2021);

    }

    public static void isVariable() {
        byte number1 = 10;
        short number2 = 100;
        int number3 = 250000000;
        long number4 = 3200000000000L;
        char letter = 'D';
        float pi = 3.14f;
        double sum = 123.4456;
        boolean value = true;
        String str = "I love Java!";
        System.out.println("Значение - " + number1);
        System.out.println("Значение - " + number2);
        System.out.println("Значение - " + number3);
        System.out.println("Значение - " + number4);
        System.out.println("Значение - " + letter);
        System.out.println("Значение - " + pi);
        System.out.println("Значение - " + sum);
        System.out.println("Значение - " + value);
        System.out.println("Значение - " + str);
    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        return (x1 + x2 >= 10) && (x1 + x2 <= 20);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

    public static boolean isNegative(int y) {
        return y < 0;
    }
    public static void greetings(String name){
        System.out.println("Привет, " + name + "!");
    }

    public static void isYears (int a){
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println(a + " год високосный");
        } else {
            System.out.println(a + " год не високосный");
        }
    }
}