package com.slotvinskiy;

// 5. Задан круг с радиусом r с центром в точке (x,y).
//Вернуть список точек с целочисленными координатами которые попадают в круг.

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        int r = 3;
        Set<String> points = new TreeSet<>();
        String temp;
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= r; j++) {
                if (Math.hypot(i, j) <= r) {
                    temp = "(" + i + "; " + -j + ")";
                    points.add(temp);
                    temp = "(" + i + "; " + j + ")";
                    points.add(temp);
                    temp = "(" + -i + "; " + j + ")";
                    points.add(temp);
                    temp = "(" + -i + "; " + -j + ")";
                    points.add(temp);
                }
            }
        }
        System.out.println(points);
    }
}
