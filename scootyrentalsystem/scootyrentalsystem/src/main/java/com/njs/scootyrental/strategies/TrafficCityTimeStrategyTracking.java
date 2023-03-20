package com.njs.scootyrental.strategies;

public class TrafficCityTimeStrategyTracking implements DistanceTimeMatchingStrategy{
    @Override
    public int timeForFromDistanceToDestination() {
        return 1200;
    }
}
