public class Circle {

    private double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circle_area(){
        return PI*Math.pow(radius, 2);
    }

    public double circle_perimeter() {

        return 2 * PI * radius;
    }
}
