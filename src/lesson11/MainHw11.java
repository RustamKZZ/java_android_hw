package lesson11;


import java.util.ArrayList;
import java.util.Arrays;

public class MainHw11 {
    public static void main(String[] args) {
        Integer arr1 [] = {1, 2 ,3 , 4 , 5};
        String arr2 [] = {"AB", "CD", "IF"};
        swap(arr1, 1,3);
        swap(arr2, 0,2);

        String[] arrayOfString = {"ABC", "DIF", "G"};
        asList(arrayOfString);

        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> apl = new Box<>();
        Box<Apple> apl1 = new Box<>();
        or.addTo(new Orange(), 5);
        or1.addTo(new Orange(), 7);
        apl.addTo(new Apple(), 3);
        apl1.addTo(new Apple(), 5);
        System.out.println("**************");
        System.out.println("Ящик апельсинов: " + or.getWeight());
        System.out.println("Ящик1 апельсинов: " + or1.getWeight());
        System.out.println("Ящик яблок: " + apl.getWeight());
        System.out.println("Ящик1 яблок: " + apl1.getWeight());
        System.out.println(or.compare(apl));
        System.out.println(apl.compare(or1));
        or.pourTo(or1);
        apl.pourTo(apl1);
        System.out.println("Ящик апельсинов: " + or.getWeight());
        System.out.println("Ящик1 апельсинов: " + or1.getWeight());
        System.out.println("Ящик яблок: " + apl.getWeight());
        System.out.println("Ящик1 яблок: " + apl1.getWeight());


    }
    public static void swap (Object[] arr, int x1, int x2){
        System.out.println("До замены: "  + Arrays.toString(arr));
        Object sw = arr[x1];
        arr [x1] = arr [x2];
        arr [x2] = sw;
        System.out.println("После замены: " + Arrays.toString(arr));
    }

    public static <T> void asList(T[]arr){
        ArrayList <T> print = new ArrayList<>(Arrays.asList(arr));
        System.out.println("***************");
        System.out.println(print);

    }

}
