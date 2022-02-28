package com.richmond.moduleone.database;

public abstract class TwoDShape {
        public double width;
        public double height;
        public  Colour colour;
        public  double side1;
        public  double side2;
        public  double side3;
        public  double radius;

    public double calS(){
        double s=(side1+side2+side3)/2;
        return s;
    }

    public TwoDShape(double width, double height){
        super();
        this.width=width;
        this.height=height;
    }

    public TwoDShape(double side1,double side2, double side3) {
        super();
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public TwoDShape(double radius){
        super();
        this.radius=radius;
    }

    public abstract double calArea();

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getRadius() {
        return radius;
    }
}
