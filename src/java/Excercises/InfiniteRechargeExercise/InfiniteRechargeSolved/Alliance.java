package Excercises.InfiniteRechargeExercise.InfiniteRechargeSolved;

public class Alliance {
    private boolean isBlue;
    private Robot robot;
    private Robot robot2;
    private Robot robot3;

    public Alliance(boolean isBlue, Robot robot, Robot robot2, Robot robot3) {
        this.isBlue = isBlue;
        this.robot = robot;
        this.robot2 = robot2;
        this.robot3 = robot3;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public void setBlue(boolean blue) {
        isBlue = blue;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
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

    public int getTotalPoints() {
        int sum = this.robot.getTotalPoints() + this.robot2.getTotalPoints() + this.robot3.getTotalPoints();
        boolean haveAllRobotsClimbed = this.robot.isHasClimbed() && this.robot2.isHasClimbed() && this.robot3.isHasClimbed();
        return haveAllRobotsClimbed ? sum + 15 : sum;
    }

    @Override
    public String toString() {
        return "Alliance{" +
                "isBlue=" + isBlue +
                ", robot=" + robot +
                ", robot2=" + robot2 +
                ", robot3=" + robot3 +
                '}';
    }
}
