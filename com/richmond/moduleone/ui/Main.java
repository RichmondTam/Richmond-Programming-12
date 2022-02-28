package com.richmond.moduleone.ui;

import com.richmond.moduleone.database.Circle;
import com.richmond.moduleone.database.HeronTriangle;
import com.richmond.moduleone.database.Triangle;
import com.richmond.moduleone.database.TwoDShape;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TwoDShape> twoDShapes = new ArrayList<>();
        twoDShapes.add(new Triangle(4,5));
        twoDShapes.add(new HeronTriangle(10,11,12));
        twoDShapes.add(new Circle(9));

        for (TwoDShape t : twoDShapes) {
            System.out.println(t.calArea());
        }
    }
    }



