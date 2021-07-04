package lesson04;

import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final int SIZE = 3; // поле 3/3
    static final char DOT_X = 'X'; // фишка игрока Х
    static final char DOT_O = 'O'; // фишка компьютра О
    static final char DOT_EMPTY = '.'; // пустые ячейки .
    static char[][] map; // объявление поля ввиде 2D массива
    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (chekWin(DOT_X)) {
                System.out.println("Вы победили!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (chekWin(DOT_O)) {
                System.out.println("Компьютер победил!!!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }

    }
    public static void initMap (){  // метод инизиализации поля
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }
    public static void printMap () {  // метод распечатки поля
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1); // обозначение строк столбов  1 2 3
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map [i][j]);
            }
            System.out.println();
        }

    }
    public static void humanTurn(){  // метод хода игрока
        int y;
        int x;

        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1; // считываем координты - 1, т.к. массив с 0
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map [y][x] = DOT_X;
    }
    public static void aiTurn () { //метод хода компьютера
        int y;
        int x;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
            map [y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {  // метод проверки правильности ввода координат
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) { // условия проверки (если за границы поля, то ложь)
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }
    public static boolean isFull () {  //метод проверки заполненности ячеек поля (НИЧЬЯ)
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean chekWin (char c) {
        int counter = 0;
        for (int i = 0; i < SIZE; i++) {   // диагональ1
            for (int j = 0; j < SIZE; j++) {
                if (SIZE - 1 - i == j && map[i][j] == c){
                    counter++;
                }
            }

        }
        if (counter == SIZE) {
            return true;
        } else {
            counter = 0;
        }
        for (int i = 0; i < SIZE; i++) {    // диагональ2
            for (int j = 0; j < SIZE; j++) {
                if (i == j && map[i][j] == c) {
                    counter++;
                }

            }
        }
        if (counter == SIZE){
            return true;
        } else {
            counter = 0;
        }
        for (int i = 0; i < SIZE; i++) {   //горизонт
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == c){
                    counter++;
                }
            }
            if (counter == SIZE){
                return true;
            } else {
                counter = 0;
            }
        }
        counter = 0;
        for (int i = 0; i < SIZE; i++) {    //вертикаль
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == c){
                    counter++;

                }
            }
            if (counter == SIZE){
                return true;
            }else {
                counter = 0;
            }
        }
        return false;

       /* if (map[0][0] == c && map[0][1] == c && map[0][2] == c) {
            return true;
        } // горизонтальная линия
        if (map[1][0] == c && map[1][1] == c && map[1][2] == c) {
            return true;
        }
        if (map[2][0] == c && map[2][1] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][0] == c && map[2][0] == c) {
            return true;
        } // вертикальная линия
        if (map[0][1] == c && map[1][1] == c && map[2][1] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][2] == c && map[2][2] == c) {
            return true;
        }

        if (map[0][0] == c && map[1][1] == c && map[2][2] == c) {
            return true;
        }
        if (map[0][2] == c && map[1][1] == c && map[2][0] == c) {
            return true;
        }

        return false;*/
    }



}
