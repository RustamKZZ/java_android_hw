package lesson07;

public class Cat {
     private String name;
     private int appetite;
     private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }

    public void info(){
        String isHungry = !hungry ? "сыт" : "голоден";
        System.out.println("Кот " + name + ":" + isHungry);
    }
    public void eat (Plate plate){
        if (hungry && plate.decreaseFood(appetite)) {
            hungry = false;
        }

    }
}
