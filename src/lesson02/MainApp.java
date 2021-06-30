package lesson02;

public class MainApp {
    public static void main(String[] args) {
        invertArray();
        System.out.println("\t Задание 1");
        fillArray();
        System.out.println("\t Задание 2");
        changeArray();
        System.out.println("\t Задание 3");
        fillDiagonal();
        System.out.println("\t Задание 4");
        minMaxArr();
        System.out.println("\t Задание 5");
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("\t");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] > 6) {
                w[i] *= 2;
                System.out.print(w[i] + " ");
            }
        }
    }

    public static void fillDiagonal() {
        int len = 5;
        int[][] arr = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if ((i == j) || (i == len - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void minMaxArr(){
        int numArr []= {10, 256, 98564, -1235, 4528, -100, 25};
        int min, max;
        min = max = numArr[0];
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
            if (numArr[i] >max){
                max = numArr[i];
            }
            System.out.println(min +  " " + max);
        }
    }

}

