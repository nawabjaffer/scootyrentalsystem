package com.njs.scootyrental.model;

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double distanceTo(Location otherLocation) {
        double lat1 = Math.toRadians(latitude);
        double lon1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(otherLocation.getLatitude());
        double lon2 = Math.toRadians(otherLocation.getLongitude());

        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dlon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distanceInMeters = 6371000 * c;

        return distanceInMeters / 1000; // in kilometers
    }
}