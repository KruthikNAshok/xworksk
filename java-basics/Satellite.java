public class Satellite {
    static String name = "INSAT-4B";
    static String country = "India";
    static String purpose = "Communication";
    static double weight = 3000;
    static boolean solarPowered = true;
    static String launchDate = "12-Mar-2020";
    static String orbitType = "GEO";
    static boolean remoteSensing = false;
    static boolean gpsEnabled = true;
    static boolean cameraAttached = true;
    static int lifespanYears = 15;
    static String launchVehicle = "GSLV";
    static boolean telemetry = true;
    static boolean trackingSystem = true;
    static boolean thermalControl = true;
    static String controlCenter = "ISRO Bengaluru";
    static boolean earthObservation = false;
    static boolean dataEncryption = true;
    static String status = "Active";
    static boolean automaticNavigation = true;
    static boolean multiBandTransmitter = true;
    static boolean disasterSupport = true;

    public static void main(String[] args) {
        System.out.println("Satellite Name: " + name);
        System.out.println("country " + country);
		System.out.println("purpose " + purpose);
		System.out.println("weight " + weight);
		System.out.println("solarPowered  " +solarPowered );
		System.out.println("launchDate " + launchDate);
    }
}
