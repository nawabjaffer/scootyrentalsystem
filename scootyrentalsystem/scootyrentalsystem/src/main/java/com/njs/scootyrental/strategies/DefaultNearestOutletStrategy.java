package com.njs.scootyrental.strategies;

import com.njs.scootyrental.model.Location;

public class DefaultNearestOutletStrategy implements  NearestOutletMatchingStrategy{
    @Override
    public int matchdroplocationtoNearestOutlet(Location x, Location y) {
        double latitude = x.getLatitude()-y.getLatitude();
        double longitude = x.getLongitude()-y.getLongitude();
        return (int) Math.floor(Math.sqrt(latitude*latitude-longitude*longitude));
    }


}
