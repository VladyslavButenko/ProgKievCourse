package figure;

public class Triangle extends Figure {
    private double cathetusOne;
    private double cathetusTwo;
    private double hypotenuse;

    public Triangle(double cathetusOne, double cathetusTwo, double hypotenuse) {
        this.cathetusOne = cathetusOne;
        this.cathetusTwo = cathetusTwo;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public double getSquare() {
        return cathetusOne * cathetusTwo / 2;
    }
}
