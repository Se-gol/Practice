package Excercises.InfiniteRechargeExercise.InfiniteRechargeSolved;

public class Game {
    private Alliance blueAlliance;
    private Alliance redAlliance;

    public Game(Alliance blueAlliance, Alliance redAlliance) {
        this.blueAlliance = blueAlliance;
        this.redAlliance = redAlliance;
    }

    public Alliance getBlueAlliance() {
        return blueAlliance;
    }

    public void setBlueAlliance(Alliance blueAlliance) {
        this.blueAlliance = blueAlliance;
    }

    public Alliance getRedAlliance() {
        return redAlliance;
    }

    public void setRedAlliance(Alliance redAlliance) {
        this.redAlliance = redAlliance;
    }

    public void printWinner() {
        if (this.blueAlliance.getTotalPoints() == this.redAlliance.getTotalPoints()) {
            System.out.println("IT'S A DRAW!");
            return;
        }
        System.out.println(this.blueAlliance.getTotalPoints() > this.redAlliance.getTotalPoints() ? "THE BLUE ALLIANCE WON!" : "THE RED ALLIANCE WON!");
    }

    @Override
    public String toString() {
        return "Game{" +
                "blueAlliance=" + blueAlliance +
                ", redAlliance=" + redAlliance +
                '}';
    }
}
