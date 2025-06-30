class Hospitall {

    static String cardiologyDoctors[] = {
        "Dr. Rao", "Dr. Verma", "Dr. Iyer", "Dr. Kumar", "Dr. Shastri",
        "Dr. Srinivas", "Dr. Dey", "Dr. Mehta", "Dr. Patil", "Dr. Gupta"
    };

    static String neurologyDoctors[] = {
        "Dr. Ramesh", "Dr. Nayak", "Dr. Bose", "Dr. Kapadia", "Dr. Sinha",
        "Dr. Kulkarni", "Dr. Pillai", "Dr. Rawat", "Dr. Bhatia", "Dr. Mahajan"
    };

    static String orthopedicsDoctors[] = {
        "Dr. Joseph", "Dr. Abraham", "Dr. Nair", "Dr. Dsouza", "Dr. Das",
        "Dr. Shah", "Dr. Chauhan", "Dr. Khan", "Dr. Bhaskar", "Dr. Borse"
    };

    static String dermatologyDoctors[] = {
        "Dr. Shalini", "Dr. Neha", "Dr. Swati", "Dr. Anjali", "Dr. Sneha",
        "Dr. Rekha", "Dr. Anitha", "Dr. Priya", "Dr. Ritu", "Dr. Sonali"
    };

    static String pediatricsDoctors[] = {
        "Dr. Arjun", "Dr. Rahul", "Dr. Namrata", "Dr. Nidhi", "Dr. Smita",
        "Dr. Manish", "Dr. Mohan", "Dr. Vivek", "Dr. Gaurav", "Dr. Sudha"
    };

    static String entDoctors[] = {
        "Dr. Sameer", "Dr. Pallavi", "Dr. Harish", "Dr. Pramod", "Dr. Shweta",
        "Dr. Tarun", "Dr. Latha", "Dr. Madhav", "Dr. Neel", "Dr. Reshma"
    };

    static String oncologyDoctors[] = {
        "Dr. Surya", "Dr. Raghav", "Dr. Tejas", "Dr. Bhavna", "Dr. Vandana",
        "Dr. Preeti", "Dr. Ajay", "Dr. Sangeeta", "Dr. Rakesh", "Dr. Amrita"
    };

    static String nephrologyDoctors[] = {
        "Dr. Rituja", "Dr. Arvind", "Dr. Charan", "Dr. Prakash", "Dr. Nitin",
        "Dr. Raghunath", "Dr. Saif", "Dr. Sakshi", "Dr. Zameer", "Dr. Jayesh"
    };

    static String gastroDoctors[] = {
        "Dr. Naveen", "Dr. Savita", "Dr. Hina", "Dr. Amit", "Dr. Jaya",
        "Dr. Deepak", "Dr. Rishabh", "Dr. Kamal", "Dr. Tina", "Dr. Niranjan"
    };

    static String urologyDoctors[] = {
        "Dr. Murthy", "Dr. Basu", "Dr. Kumar", "Dr. Suresh", "Dr. Krish",
        "Dr. Satya", "Dr. Gayatri", "Dr. Kavita", "Dr. Manju", "Dr. Bindu"
    };

    static String gynecologyDoctors[] = {
        "Dr. Aarti", "Dr. Shreya", "Dr. Snehal", "Dr. Leela", "Dr. Madhuri",
        "Dr. Seema", "Dr. Rupali", "Dr. Jigna", "Dr. Trupti", "Dr. Sakina"
    };

    static String pathologyDoctors[] = {
        "Dr. Mahesh", "Dr. Vandit", "Dr. Iqbal", "Dr. Bhargav", "Dr. Haritha",
        "Dr. Shalini", "Dr. Komal", "Dr. Falguni", "Dr. Neetu", "Dr. Akarsh"
    };

    static String psychologyDoctors[] = {
        "Dr. Reema", "Dr. Vikram", "Dr. Tanya", "Dr. Asha", "Dr. Prerna",
        "Dr. Bharat", "Dr. Megha", "Dr. Rohit", "Dr. Ankita", "Dr. Tapan"
    };

    static String radiologyDoctors[] = {
        "Dr. Pooja", "Dr. Sandhya", "Dr. Meenal", "Dr. Shraddha", "Dr. Sujata",
        "Dr. Praveen", "Dr. Charu", "Dr. Nirav", "Dr. Deeksha", "Dr. Vinay"
    };

    static String anesthesiologyDoctors[] = {
        "Dr. Sunil", "Dr. Hemant", "Dr. Shiv", "Dr. Raman", "Dr. Nayana",
        "Dr. Suhas", "Dr. Bhushan", "Dr. Kalpana", "Dr. Nilesh", "Dr. Vikas"
    };

    static String pulmonologyDoctors[] = {
        "Dr. Arvind", "Dr. Mona", "Dr. Shruti", "Dr. Bhanu", "Dr. Lalit",
        "Dr. Pritam", "Dr. Geeta", "Dr. Arpita", "Dr. Sheetal", "Dr. Pranav"
    };

    static String dentalDoctors[] = {
        "Dr. Neelam", "Dr. Parag", "Dr. Rashmi", "Dr. Varun", "Dr. Ayesha",
        "Dr. Laxmi", "Dr. Tejal", "Dr. Sudhir", "Dr. Rachana", "Dr. Mansi"
    };

    static String emergencyDoctors[] = {
        "Dr. Rajat", "Dr. Smriti", "Dr. Danish", "Dr. Sheetal", "Dr. Ravi",
        "Dr. Kiran", "Dr. Swarna", "Dr. Bhupendra", "Dr. Vishal", "Dr. Gayathri"
    };

    static String generalSurgeryDoctors[] = {
        "Dr. Ajith", "Dr. Rafiq", "Dr. Dinesh", "Dr. Vipin", "Dr. Jyoti",
        "Dr. Manoj", "Dr. Vikash", "Dr. Sejal", "Dr. Mahima", "Dr. Palak"
    };

    static String rehabilitationDoctors[] = {
        "Dr. Kalra", "Dr. Kunal", "Dr. Zeba", "Dr. Rashid", "Dr. Anirudh",
        "Dr. Nagma", "Dr. Avani", "Dr. Ishaan", "Dr. Latha", "Dr. Tushar"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Cardiology Doctors:");
        for(String name : cardiologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Neurology Doctors:");
        for(String name : neurologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Orthopedics Doctors:");
        for(String name : orthopedicsDoctors) {
            System.out.println(name);
        }

        System.out.println("Dermatology Doctors:");
        for(String name : dermatologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Pediatrics Doctors:");
        for(String name : pediatricsDoctors) {
            System.out.println(name);
        }

        System.out.println("ENT Doctors:");
        for(String name : entDoctors) {
            System.out.println(name);
        }

        System.out.println("Oncology Doctors:");
        for(String name : oncologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Nephrology Doctors:");
        for(String name : nephrologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Gastroenterology Doctors:");
        for(String name : gastroDoctors) {
            System.out.println(name);
        }

        System.out.println("Urology Doctors:");
        for(String name : urologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Gynecology Doctors:");
        for(String name : gynecologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Pathology Doctors:");
        for(String name : pathologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Psychology Doctors:");
        for(String name : psychologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Radiology Doctors:");
        for(String name : radiologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Anesthesiology Doctors:");
        for(String name : anesthesiologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Pulmonology Doctors:");
        for(String name : pulmonologyDoctors) {
            System.out.println(name);
        }

        System.out.println("Dental Doctors:");
        for(String name : dentalDoctors) {
            System.out.println(name);
        }

        System.out.println("Emergency Doctors:");
        for(String name : emergencyDoctors) {
            System.out.println(name);
        }

        System.out.println("General Surgery Doctors:");
        for(String name : generalSurgeryDoctors) {
            System.out.println(name);
        }

        System.out.println("Rehabilitation Doctors:");
        for(String name : rehabilitationDoctors) {
            System.out.println(name);
        }

        System.out.println("main ended");
    }
}
