package lesson05;

public class Personals {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int payday;
    private int age;

    public Personals(String name, String position, String email, String phoneNumber, int payday, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.payday = payday;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Personals{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", payday=" + payday +
                ", age=" + age +
                '}';

    }

    public static void main(String[] args) {
        Personals [] employees = new Personals[5];
        employees [0] = new Personals("Шихов Владимир Анатольевич", "Директор", "vvsh@mail", "79550010101", 250000, 38);
        employees [1] = new Personals("Зайцева Людмила Петровна", "Бухгалтер", "zz@mail", "79550020202", 150000, 43);
        employees [2] = new Personals("Петров Андрей Юрьевич", "Руководитель отдела", "pp@mail", "79550030303", 130000, 41);
        employees [3] = new Personals("Сидоров Сергей Иванович", "Менеджер", "ss@mail", "79550040404", 100000, 32);
        employees [4] = new Personals("Иванов Николай Петрович", "Водитель", "ii@mail", "79550050505", 80000, 47);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].age > 40){
                System.out.println(employees[i]);
            }
        }

    }

}
