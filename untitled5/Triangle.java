public class Triangle extends TwoDShape implements Rotate{
    double side1;
    double side2;
    double side3;
    double s;

    public Triangle(double width, double height){
    area=width*height/2;
    }
    public Triangle(double side1,double side2, double side3){
       double lengthOfSide=side1*side2*side3;
    }
    private double heronHeight(){
        double s=(side1+side2+side3)/2;


        return s;
    }
    public double getArea(){

        return super.area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", s=" + s +
                '}';
    }
}
