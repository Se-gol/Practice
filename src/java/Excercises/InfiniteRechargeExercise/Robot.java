package Excercises.InfiniteRechargeExercise;

public class Robot {
    int points;
    private boolean hasClimbed;
    private int bottomPowerCells;
    private int outerPowerCells;
    private int innerPowerCells;
    private int autoInnerPowerCells;
    private int autoBottomPowerCells;
    private int autoOuterPowerCells;

    public Robot(int bottomPowerCells, int outerPowerCells, int innerPowerCells, int autoInnerPowerCells, int autoBottomPowerCells, int autoOuterPowerCells, boolean hasClimbed) {
        this.hasClimbed = hasClimbed;
        this.bottomPowerCells = bottomPowerCells * 4;
        this.outerPowerCells = outerPowerCells * 6;
        this.innerPowerCells = innerPowerCells * 2;
        this.autoInnerPowerCells = autoInnerPowerCells * 2;
        this.autoBottomPowerCells = autoBottomPowerCells;
        this.autoOuterPowerCells = autoOuterPowerCells * 3;
    }

    public boolean isHasClimbed() {
        return hasClimbed;
    }

    public void setHasClimbed(boolean hasClimbed) {
        this.hasClimbed = hasClimbed;
    }

    public int getBottomPowerCells() {
        return bottomPowerCells;
    }

    public void setBottomPowerCells(int bottomPowerCells) {
        this.bottomPowerCells = bottomPowerCells;
    }

    public int getOuterPowerCells() {
        return outerPowerCells;
    }

    public void setOuterPowerCells(int outerPowerCells) {
        this.outerPowerCells = outerPowerCells * 2;
    }

    public int getInnerPowerCells() {
        return innerPowerCells;
    }

    public void setInnerPowerCells(int innerPowerCells) {
        this.innerPowerCells = innerPowerCells * 3;
    }

    public int getAutoBottomPowerCells() {
        return autoBottomPowerCells;
    }

    public void setAutoBottomPowerCells(int autoBottomPowerCells) {
        this.autoBottomPowerCells = autoBottomPowerCells * 2;
    }

    public int getAutoOuterPowerCells() {
        return autoOuterPowerCells;
    }

    public void setAutoOuterPowerCells(int autoOuterPowerCells) {
        this.autoOuterPowerCells = autoOuterPowerCells * 4;
    }

    public int getAutoInnerPowerCells() {
        return autoInnerPowerCells;
    }

    public void setAutoInnerPowerCells(int autoInnerPowerCells) {
        this.autoInnerPowerCells = autoInnerPowerCells * 6;
    }

    public int totalPoints() {
        if (hasClimbed == true) {
            points = this.autoBottomPowerCells + this.autoInnerPowerCells
                    + this.outerPowerCells + this.bottomPowerCells + this.autoOuterPowerCells + this.innerPowerCells + 30;
        } else {
            points = this.autoBottomPowerCells + this.autoInnerPowerCells
                    + this.outerPowerCells + this.bottomPowerCells + this.autoOuterPowerCells + this.innerPowerCells;
        }
        return points;
    }

}


