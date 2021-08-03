package Excercises.InfiniteRechargeExercise;

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
        this.blueAlliance = getBlueAlliance();
    }

    public Alliance getRedAlliance() {
        return redAlliance;
    }

    public void setRedAlliance(Alliance redAlliance) {
        this.redAlliance = getRedAlliance();
    }

    public void result() {
        String WIN;
        if (redAlliance.allAlliancePoints() == blueAlliance.allAlliancePoints()) {
            WIN = "TIE!";
        } else if (redAlliance.allAlliancePoints() > blueAlliance.allAlliancePoints())
            WIN = "The Red Alliance Won!";
        else {
            WIN = "The Blue Alliance Won!";
        }
        System.out.println(WIN);

    }
}