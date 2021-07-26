package lesson10;

import java.util.HashMap;
import java.util.Map;

public class MainHw10 {
    public static void main(String[] args) {
        wordArr();


    }

    private static void wordArr () {
        Map <String, Integer> hm = new HashMap<>();
        String words [] = {
                "Toyota", "KIA", "Mercedes",
                "BMW", "AUDI", "LADA", "Honda",
                "KIA", "Skoda", "Mazda", "Honda"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i])) {
                hm.put(words[i], hm.get(words[i]) + 1 );
            } else {
                hm.put(words[i], 1);
            }
            System.out.println(hm);

        }

        System.out.println("**********");


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Kuzmin", "123123");
        phoneBook.add("Petrov", "456456");
        phoneBook.add("Sidorov", "789789");
        phoneBook.add("Kuzmin", "159753");

        System.out.println("Kuzmin - " + phoneBook.get("Kuzmin"));
        System.out.println("Petrov - " + phoneBook.get("Petrov"));
        System.out.println("Sidorov - " + phoneBook.get("Sidorov"));
        System.out.println("Kuzmin - " + phoneBook.get("Kuzmin"));
    }


}

