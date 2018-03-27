public class Rectangle {

    public double rectangle_area(double weight, double height){
        double area;
        area = weight * height;
        return area;
    }

    public double rectangle_primeter(double weight, double height) {

        return 2*(weight + height);
    }

    public String draw_rectangle(int weight, int height) {
        String output = "";
        for(int i=0; i<weight; i++){
            for(int j=0; j<height; j++){
                output += "*";
            }
            output += "\n";
        }
        return output;

    }
}
