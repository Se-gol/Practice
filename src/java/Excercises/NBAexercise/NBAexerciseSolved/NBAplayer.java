package Excercises.NBAexercise.NBAexerciseSolved;

import java.util.Random;

public class NBAplayer {
    private String fullName;
    private double twoPointPercentage;
    private int twoPointAttempts;
    private double threePointPercentage;
    private int threePointAttempts;

    public NBAplayer(String fullName, double twoPointPercentage, int twoPointAttempts, double threePointPercentage, int threePointAttempts) {
        this.fullName = fullName;
        this.twoPointPercentage = twoPointPercentage;
        this.twoPointAttempts = twoPointAttempts;
        this.threePointPercentage = threePointPercentage;
        this.threePointAttempts = threePointAttempts;
    }

    public String getFullName() {
        return fullName;
    }

    public double getTwoPointPercentage() {
        return twoPointPercentage;
    }

    public int getTwoPointAttempts() {
        return twoPointAttempts;
    }

    public double getThreePointPercentage() {
        return threePointPercentage;
    }

    public int getThreePointAttempts() {
        return threePointAttempts;
    }

    private boolean willScore(double percentage) {
        int decimalPointMultiplier = 10;
        percentage = (int) (percentage * decimalPointMultiplier);
        Random rnd = new Random();
        boolean willScore = false;
        for (int i = 0; i < percentage; i++) {
            if (rnd.nextInt(100 * decimalPointMultiplier - i) == rnd.nextInt(100 * decimalPointMultiplier - i)) {
                willScore = true;
            }
        }
        return willScore;
    }

    public int getTotalPoints() {
        int points = 0;
        for (int i = 0; i < this.twoPointAttempts; i++) {
            if (willScore(this.twoPointPercentage)) {
                points += 2;
            }
        }

        for (int i = 0; i < this.threePointAttempts; i++) {
            if (willScore(this.threePointPercentage)) {
                points += 3;
            }
        }
        return points;
    }


    @Override
    public String toString() {
        return "nbaPlayer{" +
                "twoPointPercentage=" + twoPointPercentage +
                ", twoPointAttempts=" + twoPointAttempts +
                ", threePointPercentage=" + threePointPercentage +
                ", threePointAttempts=" + threePointAttempts +
                '}';
    }
}
