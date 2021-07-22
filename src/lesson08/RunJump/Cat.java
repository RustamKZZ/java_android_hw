package lesson08.RunJump;

public class Cat implements RunJumpuble {
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public boolean run(int length) {
        if (length <= run) {
            System.out.println("Кот " + name + " успешно пробежал " + length);
            return true;
        } else {
            System.out.println("Кот " + name + " не смог пробежать " + length);
            return false;
        }


    }

    @Override
    public boolean jump(int height) {
        if (height <= jump) {
            System.out.println("Кот " + name + " успешно перепрыгнул " + height);
            return true;
        } else {
            System.out.println("Кот " + name + " не перепрыгнул " + height);
            return false;
        }
    }
}
