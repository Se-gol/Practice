package Excercises.NBAexercise.NBAexerciseSolved;

public class NBAexerciseMain {

    public static void main(String[] args) {
        NBAplayer homePlayer1 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer homePlayer2 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer homePlayer3 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer homePlayer4 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer homePlayer5 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAteam homeTeam = new NBAteam("Bucks", "Milwaukee", homePlayer1, homePlayer2, homePlayer3, homePlayer4, homePlayer5);

        NBAplayer awayPlayer1 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer awayPlayer2 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer awayPlayer3 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer awayPlayer4 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAplayer awayPlayer5 = new NBAplayer("Full Name", 60, 10, 30, 5);
        NBAteam awayTeam = new NBAteam("Suns", "Phoenix", awayPlayer1, awayPlayer2, awayPlayer3, awayPlayer4, awayPlayer5);

        NBAgame game = new NBAgame(homeTeam, awayTeam);

        game.printWinner();
    }
}
