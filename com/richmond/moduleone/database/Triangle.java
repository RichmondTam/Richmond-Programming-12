package com.richmond.moduleone.database;

import com.richmond.moduleone.database.Rotate;
import com.richmond.moduleone.database.TwoDShape;

public class Triangle extends TwoDShape implements Rotate {


    public Triangle(double width, double height){

        super(width,height);
    }

    public double calArea() {

        return width * height / 2;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
