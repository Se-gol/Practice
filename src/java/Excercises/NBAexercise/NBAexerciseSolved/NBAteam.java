package Excercises.NBAexercise.NBAexerciseSolved;

public class NBAteam {
    private String teamName;
    private String teamCity;
    private NBAplayer player1;
    private NBAplayer player2;
    private NBAplayer player3;
    private NBAplayer player4;
    private NBAplayer player5;

    public NBAteam(String teamName, String teamCity, NBAplayer player1, NBAplayer player2, NBAplayer player3, NBAplayer player4, NBAplayer player5) {
        this.teamName = teamName;
        this.teamCity = teamCity;
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamCity() {
        return teamCity;
    }

    public NBAplayer getPlayer1() {
        return player1;
    }

    public NBAplayer getPlayer2() {
        return player2;
    }

    public NBAplayer getPlayer3() {
        return player3;
    }

    public NBAplayer getPlayer4() {
        return player4;
    }

    public NBAplayer getPlayer5() {
        return player5;
    }

    public int getTotalPoints() {
        return player1.getTotalPoints() + player2.getTotalPoints() + player3.getTotalPoints() + player4.getTotalPoints() + player5.getTotalPoints();
    }

    @Override
    public String toString() {
        return "NBAteam{" +
                "teamName='" + teamName + '\'' +
                ", teamCity='" + teamCity + '\'' +
                ", player1=" + player1 +
                ", player2=" + player2 +
                ", player3=" + player3 +
                ", player4=" + player4 +
                ", player5=" + player5 +
                '}';
    }
}
