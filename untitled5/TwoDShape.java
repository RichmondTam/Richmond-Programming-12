public class TwoDShape {
    double width;
    double height;
   double area;
    public Colour colour;
    public void calTwoDShape(double width, double height){

        area=width*height;
    }


    public static void main(String[] args) {
        TwoDShape twoDShape=new TwoDShape();

        System.out.println(area);


    }


    public  double getArea() {
        return area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
}
