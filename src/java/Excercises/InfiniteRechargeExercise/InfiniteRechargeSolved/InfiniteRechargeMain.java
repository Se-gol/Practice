package Excercises.InfiniteRechargeExercise.InfiniteRechargeSolved;

public class InfiniteRechargeMain {
    public static void main(String[] args) {
        Alliance blueAlliance = new Alliance(
                true,
                new Robot(true, 10, 10, 10, 10, 10, 10),
                new Robot(true, 10, 10, 10, 10, 10, 10),
                new Robot(true, 10, 10, 10, 10, 10, 10)
        );
        Alliance redAlliance = new Alliance(
                false,
                new Robot(true, 5, 5, 5, 5, 5, 5),
                new Robot(true, 5, 5, 5, 5, 5, 5),
                new Robot(true, 5, 5, 5, 5, 5, 5)
        );
        Game game = new Game(blueAlliance, redAlliance);
        game.printWinner();
    }
}
