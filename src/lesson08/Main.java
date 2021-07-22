package lesson08;

import lesson08.Barriers.Barrier;
import lesson08.Barriers.RunRoad;
import lesson08.Barriers.Wall;
import lesson08.RunJump.Cat;
import lesson08.RunJump.Human;
import lesson08.RunJump.Robot;
import lesson08.RunJump.RunJumpuble;

public class Main {
    public static void main(String[] args) {
        RunJumpuble actions[] = {
                new Robot("Robocop", 300, 2),
                new Human("Ivan", 500, 2),
                new Cat("Barsik", 100,1)
        };

        Barrier barriers[] = {
                new Wall(2),
                new RunRoad(100)
        };
        for (RunJumpuble a: actions) {
            for (Barrier b: barriers) {
                if (!b.moving(a)) {
                    break;
                }

            }
        }


    }

}







