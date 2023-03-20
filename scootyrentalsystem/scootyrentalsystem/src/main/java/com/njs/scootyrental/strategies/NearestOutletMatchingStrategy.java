package com.njs.scootyrental.strategies;

import com.njs.scootyrental.model.Location;

public interface NearestOutletMatchingStrategy {

    int matchdroplocationtoNearestOutlet(Location x, Location y);
}
