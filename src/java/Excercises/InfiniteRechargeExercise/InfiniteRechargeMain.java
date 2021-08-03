package Excercises.InfiniteRechargeExercise;

public class InfiniteRechargeMain {
    public static void main(String[] args) {
        Alliance blueAlliance = new Alliance(
                true,
                new Robot(6, 7, 9, 6, 6, 5, true),
                new Robot(8, 4, 5, 8, 4, 2, false),
                new Robot(3, 9, 3, 2, 7, 3, false)
        );

        Alliance redAlliance = new Alliance(
                false,
                new Robot(5, 3, 8, 7, 2, 1, true),
                new Robot(3, 9, 5, 3, 2, 4, true),
                new Robot(3, 3, 6, 2, 1, 4, false)
        );
        Game game = new Game(blueAlliance, redAlliance);
        game.result();

    }
}
