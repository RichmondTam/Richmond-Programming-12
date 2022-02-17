public class Circle extends TwoDShape{
    public final double Pi=3.14;
    private  double radius=2;
    public double area;

    public Circle(double radius){


        area=radius*radius*Pi;
    }
    public double getArea(){

        return super.area;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }
}
