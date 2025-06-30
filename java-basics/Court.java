public class Court {
    static String name = "High Court";
    static String location = "Capital City";
    static int judges = 25;
    static int lawyers = 300;
    static boolean onlineHearing = true;
    static String jurisdiction = "State";
    static int staff = 500;
    static boolean eFilingAvailable = true;
    static boolean mediationCentre = true;
    static String chiefJustice = "Justice Mehta";
    static int casesPending = 12000;
    static int casesResolved = 8000;
    static boolean surveillanceCCTV = true;
    static boolean legalAid = true;
    static boolean digitalRecords = true;
    static String courtType = "Civil & Criminal";
    static String establishedYear = "1950";
    static boolean advocateChamber = true;
    static boolean lawLibrary = true;
    static int floors = 4;
    static boolean acCourtRooms = true;
    static boolean parkingAvailable = true;

    public static void main(String[] args) {
        System.out.println("Court Name: " + name);
        System.out.println("Chief Justice: " + chiefJustice);
        System.out.println("Location: " + location);
        System.out.println("Type: " + courtType);
    }
}
