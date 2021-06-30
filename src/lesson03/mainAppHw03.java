package lesson03;

import java.util.Random;
import java.util.Scanner;

public class mainAppHw03 {
    static Scanner sc = new Scanner(System.in);
    static Random numbers = new Random();

    public static void main(String[] args) {
        int shot = 0;
        int random = numbers.nextInt(10);
        System.out.println("Угадайте число с трех попыток:");

        while (shot < 3) {
            System.out.println("Введите число от 0 до 9");
            int number = sc.nextInt();
            if (number > random) {
                System.out.println("Ваше чило больше загаданного");
            } else if (number < random) {
                System.out.println("Ваше чило меньше загаданного");
            } else if (number == random) {
                System.out.println("Вы угадали число " + random );
                System.out.println("");
            }
            shot++;
        }
        System.out.print("Ваши попытки закончились, загаданное число = " + random);
        System.out.print(" Хотите продолжить, нажмите - 1. Для выхода нажмите - 0");
        String userChoice = sc.next();
        if (userChoice.equals("1")){
            main (null);
        }
    }


}
