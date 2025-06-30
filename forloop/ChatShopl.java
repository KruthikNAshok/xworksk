class ChatShopl {
    static String paniPuri[] = {
        "Mint Pani", "Tamarind Pani", "Sweet Pani", "Spicy Pani", "Garlic Pani",
        "Sukha Puri", "Meetha Puri", "Masala Puri", "Sprout Pani Puri", "Boondi Pani"
    };

    static String bhelPuri[] = {
        "Mumbai Bhel", "Dry Bhel", "Sukha Bhel", "Cheese Bhel", "Corn Bhel",
        "Sev Bhel", "Spicy Bhel", "Green Chutney Bhel", "Sweet Chutney Bhel", "Masala Bhel"
    };

    static String dahiPuri[] = {
        "Classic Dahi Puri", "Sweet Dahi Puri", "Spicy Dahi Puri", "Corn Dahi Puri", "Boondi Dahi Puri",
        "Pomegranate Dahi Puri", "Minty Dahi Puri", "Stuffed Dahi Puri", "Masala Dahi Puri", "Onion Dahi Puri"
    };

    static String sevPuri[] = {
        "Classic Sev Puri", "Cheese Sev Puri", "Garlic Sev Puri", "Corn Sev Puri", "Sweet Sev Puri",
        "Spicy Sev Puri", "Mint Sev Puri", "Tomato Sev Puri", "Pomegranate Sev Puri", "Green Chutney Sev Puri"
    };

    static String masalaPuri[] = {
        "Hot Masala Puri", "Sweet Masala Puri", "Cheese Masala Puri", "Spicy Masala Puri", "Mint Masala Puri",
        "Corn Masala Puri", "Green Peas Masala Puri", "Mysore Masala Puri", "Boiled Potato Masala Puri", "Sprouts Masala Puri"
    };

    static String samosaChaat[] = {
        "Classic Samosa Chaat", "Cheese Samosa Chaat", "Chole Samosa Chaat", "Curd Samosa Chaat", "Mint Samosa Chaat",
        "Sweet Samosa Chaat", "Spicy Samosa Chaat", "Onion Samosa Chaat", "Tomato Samosa Chaat", "Green Peas Samosa Chaat"
    };

    static String alooTikkiChaat[] = {
        "Classic Tikki Chaat", "Curd Tikki Chaat", "Spicy Tikki Chaat", "Sweet Tikki Chaat", "Minty Tikki Chaat",
        "Chole Tikki Chaat", "Onion Tikki Chaat", "Crispy Tikki Chaat", "Boondi Tikki Chaat", "Corn Tikki Chaat"
    };

    static String papdiChaat[] = {
        "Crispy Papdi Chaat", "Curd Papdi Chaat", "Sweet Papdi Chaat", "Mint Papdi Chaat", "Tomato Papdi Chaat",
        "Onion Papdi Chaat", "Pomegranate Papdi Chaat", "Boiled Potato Papdi Chaat", "Chole Papdi Chaat", "Coriander Papdi Chaat"
    };

    static String dabeli[] = {
        "Classic Dabeli", "Cheese Dabeli", "Spicy Dabeli", "Sweet Dabeli", "Butter Dabeli",
        "Crunchy Dabeli", "Dry Fruit Dabeli", "Paneer Dabeli", "Masala Dabeli", "Garlic Dabeli"
    };

    static String kachoriChaat[] = {
        "Raj Kachori Chaat", "Sweet Kachori Chaat", "Spicy Kachori Chaat", "Curd Kachori Chaat", "Mint Kachori Chaat",
        "Cheese Kachori Chaat", "Boiled Potato Kachori Chaat", "Crispy Kachori Chaat", "Green Chutney Kachori", "Pomegranate Kachori Chaat"
    };

    static String choleChaat[] = {
        "Dry Chole Chaat", "Spicy Chole Chaat", "Sweet Chole Chaat", "Mint Chole Chaat", "Curd Chole Chaat",
        "Cheese Chole Chaat", "Sprouts Chole Chaat", "Corn Chole Chaat", "Tamarind Chole Chaat", "Crispy Chole Chaat"
    };

    static String tikkiRagda[] = {
        "Classic Ragda Tikki", "Sweet Ragda Tikki", "Spicy Ragda Tikki", "Curd Ragda Tikki", "Mint Ragda Tikki",
        "Tomato Ragda Tikki", "Corn Ragda Tikki", "Onion Ragda Tikki", "Green Peas Ragda", "Masala Ragda Tikki"
    };

    static String cornChaat[] = {
        "Butter Corn Chaat", "Spicy Corn Chaat", "Cheese Corn Chaat", "Sweet Corn Chaat", "Mint Corn Chaat",
        "Boiled Corn Chaat", "Tandoori Corn Chaat", "Green Chutney Corn", "Curd Corn Chaat", "Lemon Corn Chaat"
    };

    static String moongChaat[] = {
        "Sprout Moong Chaat", "Sweet Moong Chaat", "Spicy Moong Chaat", "Curd Moong Chaat", "Tomato Moong Chaat",
        "Mint Moong Chaat", "Onion Moong Chaat", "Green Chutney Moong", "Masala Moong Chaat", "Pomegranate Moong Chaat"
    };

    static String sproutsChaat[] = {
        "Mixed Sprouts Chaat", "Boiled Sprouts Chaat", "Spicy Sprouts Chaat", "Sweet Sprouts Chaat", "Tomato Sprouts Chaat",
        "Curd Sprouts Chaat", "Corn Sprouts Chaat", "Onion Sprouts Chaat", "Green Chutney Sprouts", "Lemon Sprouts Chaat"
    };

    static String chatpataMix[] = {
        "Mix Veg Chaat", "Masala Mix Chaat", "Tangy Mix Chaat", "Corn Mix Chaat", "Sweet Mix Chaat",
        "Spicy Mix Chaat", "Farsan Mix Chaat", "Chole Mix Chaat", "Curd Mix Chaat", "Pomegranate Mix Chaat"
    };

    static String fruitChaat[] = {
        "Apple Chaat", "Banana Chaat", "Papaya Chaat", "Grapes Chaat", "Pineapple Chaat",
        "Pomegranate Chaat", "Mango Chaat", "Sweet Lime Chaat", "Orange Chaat", "Kiwi Chaat"
    };

    static String fusionChaat[] = {
        "Chinese Bhel Chaat", "Italian Sev Puri", "Cheesy Nacho Chaat", "Tandoori Aloo Chaat", "Mexican Chaat",
        "Paneer Masala Chaat", "Spring Roll Chaat", "Schezwan Sev Chaat", "Cornflakes Chaat", "Rajasthani Chaat"
    };

    static String sandwichChaat[] = {
        "Veg Sandwich Chaat", "Grilled Sandwich Chaat", "Paneer Sandwich Chaat", "Spicy Sandwich Chaat", "Sweet Sandwich Chaat",
        "Mint Sandwich Chaat", "Cheese Sandwich Chaat", "Tandoori Sandwich Chaat", "Corn Sandwich Chaat", "Chole Sandwich Chaat"
    };

    static String tandooriChaat[] = {
        "Tandoori Aloo Chaat", "Tandoori Paneer Chaat", "Tandoori Corn Chaat", "Tandoori Broccoli Chaat", "Tandoori Mushroom Chaat",
        "Tandoori Gobi Chaat", "Tandoori Tomato Chaat", "Tandoori Mix Veg Chaat", "Tandoori Fruit Chaat", "Tandoori Onion Chaat"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        for(String item : paniPuri) {
            System.out.println(item);
        }
        for(String item : bhelPuri) {
            System.out.println(item);
        }
        for(String item : dahiPuri) {
            System.out.println(item);
        }
        for(String item : sevPuri) {
            System.out.println(item);
        }
        for(String item : masalaPuri) {
            System.out.println(item);
        }
        for(String item : samosaChaat) {
            System.out.println(item);
        }
        for(String item : alooTikkiChaat) {
            System.out.println(item);
        }
        for(String item : papdiChaat) {
            System.out.println(item);
        }
        for(String item : dabeli) {
            System.out.println(item);
        }
        for(String item : kachoriChaat) {
            System.out.println(item);
        }
        for(String item : choleChaat) {
            System.out.println(item);
        }
        for(String item : tikkiRagda) {
            System.out.println(item);
        }
        for(String item : cornChaat) {
            System.out.println(item);
        }
        for(String item : moongChaat) {
            System.out.println(item);
        }
        for(String item : sproutsChaat) {
            System.out.println(item);
        }
        for(String item : chatpataMix) {
            System.out.println(item);
        }
        for(String item : fruitChaat) {
            System.out.println(item);
        }
        for(String item : fusionChaat) {
            System.out.println(item);
        }
        for(String item : sandwichChaat) {
            System.out.println(item);
        }
        for(String item : tandooriChaat) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
