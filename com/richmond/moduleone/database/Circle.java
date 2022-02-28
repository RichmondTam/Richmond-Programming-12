package com.richmond.moduleone.database;

import com.richmond.moduleone.database.TwoDShape;

public class Circle extends TwoDShape {
    public static final double Pi=3.14;




    public Circle(double radius) {
        super(radius);

    }

    @Override
    public double calArea() {

        return radius*radius*Pi;
    }




}
