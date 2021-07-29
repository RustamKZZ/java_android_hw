package lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> phonebook;

    public PhoneBook() {
        this.phonebook = new HashMap<>();
    }

    public HashSet<String> get(String surname) {
        if (phonebook.containsKey(surname))
            return phonebook.get(surname);
            return new HashSet<>(Arrays.asList(" "));

    }

    public boolean add (String surname, String phone){
        if (phonebook.containsKey(surname)){
            HashSet<String> numberSet = phonebook.get(surname);
            if (!numberSet.contains(phone)){
                numberSet.add(phone);
            } else {
                return false;
            }
        } else {
            HashSet<String> numberSet = new HashSet<>(1);
            numberSet.add(phone);
            phonebook.put(surname, numberSet);
        }
        return true;
    }
}

