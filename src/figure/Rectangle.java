package figure;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getSquare() {
        return sideOne * sideTwo;
    }
}
