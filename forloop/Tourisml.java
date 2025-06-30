class Tourisml {
    static String heritageSites[] = {"Taj Mahal", "Red Fort", "Hampi", "Konark", "Qutub Minar", "Fatehpur Sikri", "Sanchi Stupa", "Khajuraho", "Ajanta Caves", "Ellora Caves", "Mahabalipuram", "Gwalior Fort", "Rani ki Vav", "Jantar Mantar", "Elephanta Caves"};
    static String beaches[] = {"Baga Beach", "Calangute", "Varkala", "Kovalam", "Marina Beach", "Alappuzha", "Mandarmani", "Radhanagar", "Gokarna", "Tarkarli", "Digha", "Chowpatty", "Palolem", "Anjuna", "Auroville"};
    static String hillStations[] = {"Manali", "Shimla", "Ooty", "Munnar", "Kodaikanal", "Darjeeling", "Nainital", "Mussoorie", "Coorg", "Lonavala", "Mount Abu", "Gangtok", "Auli", "Panchgani", "Tawang"};
    static String deserts[] = {"Thar Desert", "Jaisalmer", "Bikaner", "Barmer", "Pushkar", "Jodhpur", "Rann of Kutch", "Osian", "Khimsar", "Mandawa", "Shekhawati", "Tonk", "Phalodi", "Nagaur", "Deshnok"};
    static String islands[] = {"Havelock", "Neil Island", "Diu", "Minicoy", "Kavaratti", "Great Nicobar", "Barren Island", "St. Mary’s Island", "Kadmat", "Kalpeni", "Swaraj Dweep", "Chilika", "Bangaram", "Agatti", "Amini"};
    static String wildlifeSanctuaries[] = {"Jim Corbett", "Sundarbans", "Gir", "Kaziranga", "Ranthambore", "Bandipur", "Periyar", "Nagarhole", "Manas", "Sariska", "Dudhwa", "Kanha", "Pench", "Chinnar", "Tadoba"};
    static String lakes[] = {"Dal Lake", "Pichola", "Chilika", "Wular", "Loktak", "Vembanad", "Nakki", "Bhimtal", "Sambhar", "Pangong", "Tso Moriri", "Pushkar Lake", "Upper Lake", "Hussain Sagar", "Nainital Lake"};
    static String waterfalls[] = {"Jog Falls", "Dudhsagar", "Athirapally", "Nohkalikai", "Kune", "Shivanasamudra", "Courtallam", "Soochipara", "Bhimlat", "Chitrakote", "Hogenakkal", "Hebbe", "Iruppu", "Kempty", "Magod"};
    static String caves[] = {"Ajanta", "Ellora", "Elephanta", "Bhimbetka", "Badami", "Kanheri", "Udayagiri", "Jogimara", "Undavalli", "Varaha", "Kotumsar", "Krem Liat Prah", "Pandavleni", "Amarnath", "Patal Bhuvaneshwar"};
    static String forts[] = {"Red Fort", "Amer Fort", "Gwalior Fort", "Mehrangarh", "Jaisalmer Fort", "Golconda", "Chittorgarh", "Agra Fort", "Raigad", "Lohagad", "Kumbhalgarh", "Bekal", "Murud Janjira", "Jaigarh", "Sinhagad"};
    static String temples[] = {"Vaishno Devi", "Golden Temple", "Tirupati", "Somnath", "Meenakshi", "Kashi Vishwanath", "Badrinath", "Amarnath", "Shirdi", "Mahakaleshwar", "Dwarka", "Rameswaram", "Jagannath Puri", "Akshardham", "Siddhivinayak"};
    static String coldPlaces[] = {"Leh", "Ladakh", "Spiti", "Tawang", "Gulmarg", "Pahalgam", "Srinagar", "Kaza", "Nubra", "Rohtang", "Kargil", "Lachen", "Yumthang", "Keylong", "Zanskar"};
    static String backwaters[] = {"Alleppey", "Kumarakom", "Kollam", "Kuttanad", "Ashtamudi", "Thiruvallam", "Pathiramanal", "Champakulam", "Munroe Island", "Thanneermukkom", "Poovar", "Vaikom", "Punnamada", "Vembanad", "Nedumudy"};
    static String culturalSites[] = {"Khajuraho", "Konark", "Mahabalipuram", "Chidambaram", "Sanchi", "Hampi", "Warangal", "Aihole", "Madurai", "Belur", "Halebidu", "Rani ki Vav", "Bishnupur", "Patan", "Lothal"};
    static String cities[] = {"Delhi", "Mumbai", "Bangalore", "Hyderabad", "Chennai", "Pune", "Ahmedabad", "Kolkata", "Surat", "Jaipur", "Lucknow", "Bhopal", "Indore", "Chandigarh", "Coimbatore"};
    static String romanticSpots[] = {"Udaipur", "Coorg", "Munnar", "Kumarakom", "Kodaikanal", "Ooty", "Shillong", "Manali", "Goa", "Darjeeling", "Rishikesh", "Pondicherry", "Nainital", "Alleppey", "Shimla"};
    static String adventureSpots[] = {"Rishikesh", "Auli", "Bir Billing", "Lonavala", "Manali", "Kamshet", "Rohtang", "Spiti", "Leh", "Sikkim", "Chikmagalur", "Dandeli", "Zanskar", "Tirthan", "Munnar"};
    static String ecoTourism[] = {"Wayanad", "Silent Valley", "Thenmala", "Agumbe", "Coorg", "Sundarbans", "Kaziranga", "Araku", "Dzukou", "Chilika", "Valparai", "Haflong", "Kanha", "Thekkady", "Thattekad"};
    static String ruralVillages[] = {"Mawlynnong", "Ziro", "Khonoma", "Chilkur", "Pochampally", "Hodka", "Velas", "Kumbalangi", "Andretta", "Banavasi", "Raghurajpur", "Gajner", "Pelling", "Sasaram", "Shani Shingnapur"};

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Heritage Sites:");
        for(String item : heritageSites) {
            System.out.println(item);
        }

        System.out.println("Beaches:");
        for(String item : beaches) {
            System.out.println(item);
        }

        System.out.println("Hill Stations:");
        for(String item : hillStations) {
            System.out.println(item);
        }

        System.out.println("Deserts:");
        for(String item : deserts) {
            System.out.println(item);
        }

        System.out.println("Islands:");
        for(String item : islands) {
            System.out.println(item);
        }

        System.out.println("Wildlife Sanctuaries:");
        for(String item : wildlifeSanctuaries) {
            System.out.println(item);
        }

        System.out.println("Lakes:");
        for(String item : lakes) {
            System.out.println(item);
        }

        System.out.println("Waterfalls:");
        for(String item : waterfalls) {
            System.out.println(item);
        }

        System.out.println("Caves:");
        for(String item : caves) {
            System.out.println(item);
        }

        System.out.println("Forts:");
        for(String item : forts) {
            System.out.println(item);
        }

        System.out.println("Temples:");
        for(String item : temples) {
            System.out.println(item);
        }

        System.out.println("Cold Places:");
        for(String item : coldPlaces) {
            System.out.println(item);
        }

        System.out.println("Backwaters:");
        for(String item : backwaters) {
            System.out.println(item);
        }

        System.out.println("Cultural Sites:");
        for(String item : culturalSites) {
            System.out.println(item);
        }

        System.out.println("Major Cities:");
        for(String item : cities) {
            System.out.println(item);
        }

        System.out.println("Romantic Spots:");
        for(String item : romanticSpots) {
            System.out.println(item);
        }

        System.out.println("Adventure Spots:");
        for(String item : adventureSpots) {
            System.out.println(item);
        }

        System.out.println("Eco Tourism:");
        for(String item : ecoTourism) {
            System.out.println(item);
        }

        System.out.println("Rural Villages:");
        for(String item : ruralVillages) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
