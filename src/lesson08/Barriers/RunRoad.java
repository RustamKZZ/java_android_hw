package lesson08.Barriers;

import lesson08.RunJump.RunJumpuble;

public class RunRoad implements Barrier {

    private int length;

    public RunRoad(int length) {

        this.length = length;
    }

    @Override
    public boolean moving(RunJumpuble a) {
        return a.run(length);
    }
}
