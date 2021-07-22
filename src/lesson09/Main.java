package lesson09;

public class Main {
    public static void main(String[] args) {

        String arr [][] = {
                {"10", "20", "30", "40"},
                {"50", "60", "70", "80"},
                {"90", "100", "110", "12m0"},
                {"130", "140", "150", "160"}
        };

        try {

            try {
                int result = method(arr);
                System.out.println("Сумма: " + result);

            } catch (MyArraySizeException e) {
                e.printStackTrace();
                System.out.println("Размер массива превышен");
            }
        }

             catch (MyArrayDataException e) {
                e.printStackTrace();
                System.out.println("Не верное значение массиве");
                System.out.println("Ошибка в ячейке: " + e.i + " - " + e.j);
            }
        }


    public static int method (String arr [][]) throws MyArrayDataException, MyArraySizeException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }

                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Тип не соответсвует int", i, j);
                }


            }

        }
        return count;

    }

}

