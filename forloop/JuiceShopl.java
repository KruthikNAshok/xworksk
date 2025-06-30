class JuiceShopl {
    static String citrusJuices[] = {
        "Orange Juice", "Lemon Juice", "Lime Juice", "Tangerine Juice", "Grapefruit Juice",
        "Pomelo Juice", "Clementine Juice", "Mandarin Juice", "Blood Orange Juice", "Yuzu Juice",
        "Citron Juice", "Kumquat Juice", "Sweet Lime Juice", "Calamansi Juice", "Bitter Orange Juice"
    };

    static String tropicalJuices[] = {
        "Pineapple Juice", "Mango Juice", "Passion Fruit Juice", "Guava Juice", "Papaya Juice",
        "Banana Juice", "Lychee Juice", "Rambutan Juice", "Durian Juice", "Coconut Juice",
        "Jackfruit Juice", "Mangosteen Juice", "Starfruit Juice", "Tamarind Juice", "Soursop Juice"
    };

    static String berryJuices[] = {
        "Strawberry Juice", "Blueberry Juice", "Raspberry Juice", "Blackberry Juice", "Cranberry Juice",
        "Goji Berry Juice", "Acai Berry Juice", "Elderberry Juice", "Mulberry Juice", "Currant Juice",
        "Huckleberry Juice", "Boysenberry Juice", "Cloudberry Juice", "Sea Buckthorn Juice", "Lingonberry Juice"
    };

    static String mixedFruitJuices[] = {
        "Fruit Punch", "Tropical Mix", "Berry Blend", "Mango Pineapple Fusion", "Citrus Blast",
        "Summer Mix", "Orange Mango Mix", "Apple Berry Blend", "Exotic Mix", "Fruit Fiesta",
        "Jungle Juice", "Sunrise Juice", "Island Mix", "Citrus Sunrise", "Rainbow Juice"
    };

    static String vegetableJuices[] = {
        "Carrot Juice", "Beetroot Juice", "Spinach Juice", "Tomato Juice", "Cucumber Juice",
        "Celery Juice", "Pumpkin Juice", "Radish Juice", "Cabbage Juice", "Kale Juice",
        "Bitter Gourd Juice", "Zucchini Juice", "Sweet Potato Juice", "Pea Juice", "Parsley Juice"
    };

    static String greenJuices[] = {
        "Wheatgrass Juice", "Spinach Mint Juice", "Cucumber Kale Juice", "Celery Cucumber Juice", "Mint Lemon Juice",
        "Kale Pineapple Juice", "Parsley Apple Juice", "Green Detox Juice", "Herbal Mix", "Amla Juice",
        "Coriander Juice", "Moringa Juice", "Mint Ginger Juice", "Lettuce Juice", "Green Apple Juice"
    };

    static String herbalJuices[] = {
        "Tulsi Juice", "Amla Juice", "Neem Juice", "Giloy Juice", "Ashwagandha Juice",
        "Aloe Vera Juice", "Brahmi Juice", "Hibiscus Juice", "Noni Juice", "Triphala Juice",
        "Gotu Kola Juice", "Guduchi Juice", "Karela Jamun Juice", "Sarpagandha Juice", "Mint Juice"
    };

    static String seasonalJuices[] = {
        "Watermelon Juice", "Mosambi Juice", "Lychee Juice", "Plum Juice", "Jamun Juice",
        "Peach Juice", "Apricot Juice", "Cherry Juice", "Pear Juice", "Custard Apple Juice",
        "Kiwi Juice", "Fig Juice", "Grapes Juice", "Tangerine Juice", "Mulberry Juice"
    };

    static String exoticJuices[] = {
        "Dragon Fruit Juice", "Kiwi Mint Juice", "Lychee Rose Juice", "Pomegranate Mint Juice", "Blueberry Lavender Juice",
        "Cucumber Basil Juice", "Passionfruit Mojito Juice", "Guava Chili Juice", "Rose Apple Juice", "Coconut Lime Juice",
        "Tamarind Plum Juice", "Mangosteen Lime Juice", "Jackfruit Mint Juice", "Avocado Honey Juice", "Black Grape Juice"
    };

    static String coldPressedJuices[] = {
        "Cold Pressed Orange", "Cold Pressed Apple", "Cold Pressed Carrot", "Cold Pressed Beetroot", "Cold Pressed Pineapple",
        "Cold Pressed Amla", "Cold Pressed Celery", "Cold Pressed Ginger", "Cold Pressed Mint", "Cold Pressed Watermelon",
        "Cold Pressed Kale", "Cold Pressed Spinach", "Cold Pressed Cucumber", "Cold Pressed Guava", "Cold Pressed Lemon"
    };

    static String detoxJuices[] = {
        "Lemon Ginger Juice", "Beetroot Carrot Juice", "Green Detox", "Cucumber Mint", "Citrus Cleanse",
        "Turmeric Tonic", "Charcoal Lemonade", "Apple Cider Mix", "Mint Cucumber Cleanse", "Ginger Honey Juice",
        "Apple Celery Detox", "Spinach Cleanser", "Wheatgrass Booster", "Orange Ginger Juice", "Detox Trio Mix"
    };

    static String sugarFreeJuices[] = {
        "No Sugar Orange", "No Sugar Apple", "No Sugar Guava", "No Sugar Pomegranate", "No Sugar Carrot",
        "No Sugar Beet", "No Sugar Pineapple", "No Sugar Mango", "No Sugar Mix Fruit", "No Sugar Spinach",
        "No Sugar Amla", "No Sugar Lemon", "No Sugar Kiwi", "No Sugar Coconut", "No Sugar Berry Mix"
    };

    static String kidsSpecialJuices[] = {
        "Choco Banana Juice", "Apple Strawberry Juice", "Mango Milk Juice", "Vanilla Grape Juice", "Fruit Yogurt Smoothie",
        "Pineapple Ice Pop Juice", "Mixed Berry Shake", "Banana Caramel Juice", "Choco Mint Juice", "Watermelon Slush",
        "Blueberry Milk Juice", "Fruity Lassi", "Peach Yogurt Drink", "Bubble Juice", "Candy Apple Juice"
    };

    static String festiveJuices[] = {
        "Rose Sharbat", "Thandai", "Panakam", "Badam Milk", "Khus Sharbat",
        "Lemon Mint Cooler", "Masala Buttermilk", "Dry Fruit Milk", "Kokum Sharbat", "Sandalwood Sharbat",
        "Tulsi Honey Juice", "Fennel Sharbat", "Pineapple Cooler", "Jeera Buttermilk", "Mint Buttermilk"
    };

    static String energyJuices[] = {
        "Banana Honey Juice", "Peanut Butter Smoothie", "Dates Milk Juice", "Protein Berry Blend", "Nutty Mango Juice",
        "Whey Orange Shake", "Oats Banana Juice", "Almond Apple Juice", "Sattu Juice", "Egg Smoothie",
        "Spinach Protein Juice", "Choco Oats Juice", "Nut Mix Juice", "Soy Berry Juice", "Multigrain Juice"
    };

    static String fiberRichJuices[] = {
        "Papaya Oats Juice", "Carrot Apple Juice", "Beet Banana Juice", "Guava Spinach Juice", "Chia Mango Juice",
        "Pineapple Coconut Juice", "Wheat Bran Juice", "Dates Fig Juice", "Apple Flax Juice", "Berry Yogurt Juice",
        "Pumpkin Banana Juice", "Cabbage Apple Juice", "Pear Avocado Juice", "Orange Chia Juice", "Kiwi Beet Juice"
    };

    static String lowCalorieJuices[] = {
        "Cucumber Juice", "Tomato Juice", "Carrot Juice", "Beetroot Juice", "Aloe Vera Juice",
        "Mint Lemon Juice", "Spinach Juice", "Lettuce Juice", "Watermelon Juice", "Celery Juice",
        "Green Apple Juice", "Peach Juice", "Grapefruit Juice", "Guava Juice", "Pineapple Juice"
    };

    static String immunityBoosterJuices[] = {
        "Amla Ginger Juice", "Turmeric Orange Juice", "Lemon Honey Juice", "Beetroot Apple Juice", "Carrot Ginger Juice",
        "Spinach Mint Juice", "Giloy Tulsi Juice", "Pomegranate Amla Juice", "Kiwi Mint Juice", "Papaya Carrot Juice",
        "Coconut Water Mix", "Garlic Lemon Juice", "Green Tea Juice", "Neem Ginger Juice", "Triphala Juice"
    };

    static String hotJuices[] = {
        "Hot Apple Cider", "Warm Lemon Water", "Herbal Apple Juice", "Cinnamon Orange Juice", "Ginger Honey Juice",
        "Hot Carrot Juice", "Spiced Pomegranate Juice", "Steamed Mango Juice", "Heated Guava Juice", "Warm Grape Juice",
        "Hot Tomato Juice", "Spiced Pineapple Juice", "Hot Lychee Juice", "Boiled Beetroot Juice", "Masala Apple Juice"
    };

    static String premiumJuices[] = {
        "Cold Pressed Mixed Berry", "Exotic Kiwi Blend", "Organic Apple Juice", "Raw Turmeric Elixir", "Aloe Vera Mint Premium",
        "Gold Edition Mango", "Forest Berry Medley", "Heritage Grape Juice", "Signature Citrus Blend", "Vintage Orange Juice",
        "Farm Fresh Guava", "Ayurvedic Blend", "Virgin Green Juice", "Botanical Berry Extract", "Royal Pomegranate"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        for(String juice : citrusJuices) {
            System.out.println(juice);
        }
        for(String juice : tropicalJuices) {
            System.out.println(juice);
        }
        for(String juice : berryJuices) {
            System.out.println(juice);
        }
        for(String juice : mixedFruitJuices) {
            System.out.println(juice);
        }
        for(String juice : vegetableJuices) {
            System.out.println(juice);
        }
        for(String juice : greenJuices) {
            System.out.println(juice);
        }
        for(String juice : herbalJuices) {
            System.out.println(juice);
        }
        for(String juice : seasonalJuices) {
            System.out.println(juice);
        }
        for(String juice : exoticJuices) {
            System.out.println(juice);
        }
        for(String juice : coldPressedJuices) {
            System.out.println(juice);
        }
        for(String juice : detoxJuices) {
            System.out.println(juice);
        }
        for(String juice : sugarFreeJuices) {
            System.out.println(juice);
        }
        for(String juice : kidsSpecialJuices) {
            System.out.println(juice);
        }
        for(String juice : festiveJuices) {
            System.out.println(juice);
        }
        for(String juice : energyJuices) {
            System.out.println(juice);
        }
        for(String juice : fiberRichJuices) {
            System.out.println(juice);
        }
        for(String juice : lowCalorieJuices) {
            System.out.println(juice);
        }
        for(String juice : immunityBoosterJuices) {
            System.out.println(juice);
        }
        for(String juice : hotJuices) {
            System.out.println(juice);
        }
        for(String juice : premiumJuices) {
            System.out.println(juice);
        }

        System.out.println("main ended");
    }
}
