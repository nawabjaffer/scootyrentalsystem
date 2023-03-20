package com.njs.scootyrental.utils;

import com.njs.scootyrental.model.Location;

public class CommonUtils {

    public double calaculateDistancebetween2Location(Location l1, Location l2) {
        double a = (l1.x - l2.x);
        double b = (l1.y - l2.y);
        double distance = Math.sqrt((a * a) + (b * b));
        return distance;

    }
}
