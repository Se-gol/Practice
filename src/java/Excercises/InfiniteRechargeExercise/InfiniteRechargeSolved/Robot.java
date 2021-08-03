package Excercises.InfiniteRechargeExercise.InfiniteRechargeSolved;

public class Robot {
    private boolean hasClimbed;
    private int bottomPowerCells;
    private int outerPowerCells;
    private int innerPowerCells;
    private int autoBottomPowerCells;
    private int autoOuterPowerCells;
    private int autoInnerPowerCells;

    public Robot(boolean hasClimbed, int bottomPowerCells, int outerPowerCells, int innerPowerCells, int autoBottomPowerCells, int autoOuterPowerCells, int autoInnerPowerCells) {
        this.hasClimbed = hasClimbed;
        this.bottomPowerCells = bottomPowerCells;
        this.outerPowerCells = outerPowerCells;
        this.innerPowerCells = innerPowerCells;
        this.autoBottomPowerCells = autoBottomPowerCells;
        this.autoOuterPowerCells = autoOuterPowerCells;
        this.autoInnerPowerCells = autoInnerPowerCells;
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
        this.outerPowerCells = outerPowerCells*2;
    }

    public int getInnerPowerCells() {
        return innerPowerCells;
    }

    public void setInnerPowerCells(int innerPowerCells) {
        this.innerPowerCells = innerPowerCells*3;
    }

    public int getAutoBottomPowerCells() {
        return autoBottomPowerCells;
    }

    public void setAutoBottomPowerCells(int autoBottomPowerCells) {
        this.autoBottomPowerCells = autoBottomPowerCells*2;
    }

    public int getAutoOuterPowerCells() {
        return autoOuterPowerCells;
    }

    public void setAutoOuterPowerCells(int autoOuterPowerCells) {
        this.autoOuterPowerCells = autoOuterPowerCells*4;
    }

    public int getAutoInnerPowerCells() {
        return autoInnerPowerCells;
    }

    public void setAutoInnerPowerCells(int autoInnerPowerCells) {
        this.autoInnerPowerCells = autoInnerPowerCells*6;
    }

    public int getTotalPoints() {
        int powerCellPoints = this.bottomPowerCells + this.outerPowerCells * 2 + this.innerPowerCells * 3 + this.autoBottomPowerCells * 2 + this.autoOuterPowerCells * 4 + this.autoInnerPowerCells * 6;
        return this.hasClimbed ? powerCellPoints + 30 : powerCellPoints;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "hasClimbed=" + hasClimbed +
                ", bottomPowerCells=" + bottomPowerCells +
                ", outerPowerCells=" + outerPowerCells +
                ", innerPowerCells=" + innerPowerCells +
                ", autoBottomPowerCells=" + autoBottomPowerCells +
                ", autoOuterPowerCells=" + autoOuterPowerCells +
                ", autoInnerPowerCells=" + autoInnerPowerCells +
                '}';
    }
}
