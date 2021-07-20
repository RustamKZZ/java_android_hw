package lesson07;

public class Main {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat ("Барсик", 20),
                new Cat("Мурзик", 15)
        };

        Plate plate = new Plate(50);


        for (Cat cat : cats){
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();

    }



}
