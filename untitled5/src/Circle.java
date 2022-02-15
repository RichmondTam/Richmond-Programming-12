public class Circle extends TwoDShape{
    public final double Pi;
    private double radius;

    public Circle(double radius){

        Pi = 3.14;
        area=radius*radius*Pi;
    }
    public double getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Pi=" + Pi +
                ", radius=" + radius +
                '}';
    }
}
