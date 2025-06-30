public class Bank {
    static String name = "National Bank";
    static String branch = "MG Road";
    static String ifscCode = "NB0001234";
    static String manager = "Anil Kumar";
    int totalEmployees = 40;
    int customers = 5000;
    double interestRate = 6.5;
    String currency = "INR";
    boolean netBanking = true;
    boolean lockerAvailable = true;
    int atmCount = 10;
    String openingTime = "9:00 AM";
    String closingTime = "4:00 PM";
    boolean loanService = true;
    boolean mobileBanking = true;
    String swiftCode = "NBININBBXXX";
    String headOffice = "Delhi";
    int savingsAccounts = 3000;
    int currentAccounts = 1000;
    int fixedDeposits = 700;
    double minBalance = 1000.0;
    boolean kycRequired = true;

    public static void main(String[] args) {
        System.out.println("Bank Name: " +name);
        System.out.println("Branch: " +branch);
        System.out.println("Manager: " +manager);
    }
}
