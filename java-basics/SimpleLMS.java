import java.util.*;

public class SimpleLMS {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> users = new HashMap<>(); // username, password
    static ArrayList<String> courses = new ArrayList<>();

    public static void main(String[] args) {
        // Predefined users
        users.put("admin", "admin123");
        users.put("student", "stud123");

        System.out.println("==== Welcome to LMS ====");
        System.out.print("Enter username: ");
        String uname = sc.nextLine();
        System.out.print("Enter password: ");
        String pwd = sc.nextLine();

        if (authenticate(uname, pwd)) {
            if (uname.equals("admin")) {
                adminMenu();
            } else {
                studentMenu();
            }
        } else {
            System.out.println("Invalid credentials!");
        }
    }

    public static boolean authenticate(String uname, String pwd) {
        return users.containsKey(uname) && users.get(uname).equals(pwd);
    }

    public static void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("3. Logout");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    String cname = sc.nextLine();
                    courses.add(cname);
                    System.out.println("Course added successfully!");
                    break;
                case 2:
                    System.out.println("Available Courses:");
                    for (String course : courses) {
                        System.out.println("- " + course);
                    }
                    break;
                case 3:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void studentMenu() {
        System.out.println("\n--- Student Menu ---");
        System.out.println("Available Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses available yet.");
        } else {
            for (String course : courses) {
                System.out.println("- " + course);
            }
        }
    }
}