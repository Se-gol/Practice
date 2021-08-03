package Excercises.InfiniteRechargeExercise;

public class Alliance {
    private boolean isBlue;
    private Robot robot1;
    private Robot robot2;
    private Robot robot3;

    public Alliance(boolean isBlue, Robot robot1, Robot robot2, Robot robot3) {

        this.isBlue = isBlue;
        this.robot1 = robot1;
        this.robot2 = robot2;
        this.robot3 = robot3;
    }

    public Robot getRobot1() {
        return robot1;
    }

    public void setRobot1(Robot robot1) {
        this.robot1 = robot1;
    }

    public Robot getRobot2() {
        return robot2;
    }

    public void setRobot2(Robot robot2) {
        this.robot2 = robot2;
    }

    public Robot getRobot3() {
        return robot3;
    }

    public void setRobot3(Robot robot3) {
        this.robot3 = robot3;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }



    public int allAlliancePoints() {
        int aL;

        if (this.robot1.isHasClimbed() && this.robot2.isHasClimbed() && this.robot3.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 90;
        } else if (this.robot1.isHasClimbed() && this.robot2.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 60;
        } else if (this.robot1.isHasClimbed() && this.robot3.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 60;
        } else if (this.robot2.isHasClimbed() && this.robot3.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 60;
        } else if (this.robot1.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 30;
        } else if (this.robot2.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 30;
        } else if (this.robot3.isHasClimbed()) {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints() + 30;
        } else {
            aL = this.robot1.totalPoints() + this.robot2.totalPoints() + this.robot3.totalPoints();
        }
        return aL;
    }

}