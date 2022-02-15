public abstract class TwoDShape {
    double width;
    double height;
    double area;
    public TwoDShape(double width, double height){
        area=width*height;
    }
    public TwoDShape(){

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
