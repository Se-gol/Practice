package Excercises.NBAexercise.NBAexerciseSolved;

public class NBAgame {
    private NBAteam homeTeam;
    private NBAteam awayTeam;

    public NBAgame(NBAteam homeTeam, NBAteam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public NBAteam getHomeTeam() {
        return homeTeam;
    }

    public NBAteam getAwayTeam() {
        return awayTeam;
    }

    public void printWinner() {
        int homePoints = homeTeam.getTotalPoints();
        int awayPoints = awayTeam.getTotalPoints();
        if (homePoints > awayPoints) {
            System.out.println("The " + homeTeam.getTeamCity() + " " + homeTeam.getTeamName() + " have defeated the " + awayTeam.getTeamCity() + " " + awayTeam.getTeamName() + " with a score of: " + homePoints + " to " + awayPoints + ".");
        } else {
            System.out.println("The " + awayTeam.getTeamCity() + " " + awayTeam.getTeamName() + " have defeated the " + homeTeam.getTeamCity() + " " + homeTeam.getTeamName() + " with a score of: " + awayPoints + " to " + homePoints + ".");
        }
    }
}
