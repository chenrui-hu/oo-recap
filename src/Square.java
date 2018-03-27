public class Square /*extends Shape*/{

    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double square_area() {
        return Math.pow(side,2);
    }

    public double square_perimeter() {
        return 4 * side;
    }
}
