package lesson08.Barriers;

import lesson08.RunJump.RunJumpuble;

public class Wall implements Barrier {

    private int height;

    public Wall( int height) {

        this.height = height;
    }

    @Override
    public boolean moving(RunJumpuble a) {
        return a.jump(height);
    }


}




