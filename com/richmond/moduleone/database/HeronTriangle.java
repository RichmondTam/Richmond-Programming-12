package com.richmond.moduleone.database;

import com.richmond.moduleone.database.TwoDShape;

public class HeronTriangle extends TwoDShape {

    public HeronTriangle(double side1,double side2, double side3){
        super(side1,side2,side3);

    }



    public double calArea(){
        return Math.sqrt(calS()*(calS()-side1)*(calS()-side2)*(calS()-side3));
    }

}
