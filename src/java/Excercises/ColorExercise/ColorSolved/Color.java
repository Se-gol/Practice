package Excercises.ColorExercise.ColorSolved;

public class Color {
    private int r;
    private int g;
    private int b;

    public Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    private char decToHex(int dec) {
        switch (dec) {
            case 0:
                return '0';
            case 1:
                return '1';
            case 2:
                return '2';
            case 3:
                return '3';
            case 4:
                return '4';
            case 5:
                return '5';
            case 6:
                return '6';
            case 7:
                return '7';
            case 8:
                return '8';
            case 9:
                return '9';
            case 10:
                return 'A';
            case 11:
                return 'B';
            case 12:
                return 'C';
            case 13:
                return 'D';
            case 14:
                return 'E';
            case 15:
                return 'F';
        }
        return ' ';
    }

    public String toHex() {
        char rHex1 = decToHex(this.r / 16);
        char rHex2 = decToHex(this.r % 16);
        char gHex1 = decToHex(this.g / 16);
        char gHex2 = decToHex(this.g % 16);
        char bHex1 = decToHex(this.b / 16);
        char bHex2 = decToHex(this.b % 16);
        return rHex1 + "" + rHex2 + "" + gHex1 + "" + gHex2 + "" + bHex1 + "" + bHex2;
    }

    @Override
    public String toString() {
        return "Color{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}
