package Level1;

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;        // radius in km
        double kmToMiles = 1.609;      // 1 mile = 1.609 km

        // Volume of sphere: (4/3) * π * r^3
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles and calculate volume in cubic miles
        double radiusMiles = radiusKm / kmToMiles;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3
                + " and cubic miles is " + volumeMiles3);
    }
}
