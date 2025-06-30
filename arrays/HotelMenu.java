class HotelMenu {

    static String smoothies[] = {"Berry Blast", "Green Detox", "Mango Magic", "Avocado Shake", "Strawberry Delight", "Banana Boost", "Coconut Cream", "Pineapple Punch", "Tropical Thunder", "Mint Cooler"};
    static String appetizers[] = {"Nachos", "Onion Rings", "Stuffed Mushrooms", "Tacos", "Crispy Corn", "Potato Wedges", "Mini Samosas", "Cheese Balls", "Mozzarella Sticks", "Chicken Wings"};
    static String noodleDishes[] = {"Chow Mein", "Pad Thai", "Udon Noodles", "Ramen", "Hakka Noodles", "Soba Noodles", "Egg Noodles", "Veg Noodles", "Glass Noodles", "Chili Garlic Noodles"};
    static String riceBowls[] = {"Bibimbap", "Teriyaki Bowl", "Burrito Bowl", "Thai Fried Rice", "Mexican Rice", "Veg Pulao", "Biryani", "Coconut Rice", "Egg Fried Rice", "Jeera Rice"};
    static String wraps[] = {"Falafel Wrap", "Paneer Wrap", "Chicken Wrap", "Egg Wrap", "Cheese Wrap", "Tandoori Wrap", "Veggie Wrap", "Grilled Wrap", "BBQ Wrap", "Kathi Roll"};
    static String stews[] = {"Beef Stew", "Vegetable Stew", "Seafood Stew", "Chicken Stew", "Lentil Stew", "Lamb Stew", "Tofu Stew", "Curry Stew", "Pork Stew", "Spicy Tomato Stew"};
    static String bakes[] = {"Mac & Cheese", "Baked Ziti", "Cottage Pie", "Shepherd's Pie", "Veg Bake", "Potato Au Gratin", "Baked Pasta", "Stuffed Peppers", "Cheesy Cauliflower", "Baked Veggies"};
    static String kebabs[] = {"Seekh Kebab", "Shish Kebab", "Paneer Tikka", "Chicken Tikka", "Hara Bhara Kebab", "Galouti Kebab", "Chapli Kebab", "Fish Kebab", "Tofu Kebab", "Veg Kebab"};
    static String tandooriItems[] = {"Tandoori Chicken", "Tandoori Roti", "Tandoori Gobhi", "Tandoori Prawns", "Tandoori Paneer", "Tandoori Fish", "Tandoori Mushroom", "Tandoori Momos", "Tandoori Wings", "Tandoori Broccoli"};
    static String sizzlers[] = {"Veg Sizzler", "Chicken Sizzler", "Paneer Sizzler", "Seafood Sizzler", "Chinese Sizzler", "Tandoori Sizzler", "Noodle Sizzler", "Rice Sizzler", "Mushroom Sizzler", "Mixed Grill Sizzler"};
    static String fondues[] = {"Cheese Fondue", "Chocolate Fondue", "Broth Fondue", "Caramel Fondue", "Wine Fondue", "Chili Cheese Fondue", "Peanut Butter Fondue", "White Chocolate Fondue", "Savory Fondue", "Fruit Fondue"};
    static String crepes[] = {"Nutella Crepe", "Spinach Crepe", "Banana Crepe", "Cheese Crepe", "Mushroom Crepe", "Blueberry Crepe", "Chicken Crepe", "Strawberry Crepe", "Egg Crepe", "Avocado Crepe"};
    static String dumplings[] = {"Momo", "Gyoza", "Wontons", "Dim Sum", "Pork Dumpling", "Veg Dumpling", "Shrimp Dumpling", "Steamed Dumpling", "Fried Dumpling", "Soup Dumpling"};
    static String fritters[] = {"Banana Fritters", "Onion Bhaji", "Corn Fritters", "Zucchini Fritters", "Apple Fritters", "Pumpkin Fritters", "Carrot Fritters", "Sweet Potato Fritters", "Cabbage Fritters", "Paneer Fritters"};
    static String milkshakes[] = {"Oreo Shake", "Strawberry Shake", "Banana Shake", "Chocolate Shake", "Vanilla Shake", "Butterscotch Shake", "Coffee Shake", "Mango Shake", "Peanut Butter Shake", "Mixed Fruit Shake"};
    static String muffins[] = {"Blueberry Muffin", "Chocolate Muffin", "Bran Muffin", "Banana Muffin", "Lemon Muffin", "Strawberry Muffin", "Carrot Muffin", "Cranberry Muffin", "Apple Cinnamon Muffin", "Double Chocolate Muffin"};
    static String pies[] = {"Apple Pie", "Pumpkin Pie", "Key Lime Pie", "Cherry Pie", "Pecan Pie", "Meat Pie", "Mince Pie", "Coconut Pie", "Chocolate Pie", "Custard Pie"};
    static String tacos[] = {"Soft Taco", "Crunchy Taco", "Fish Taco", "Chicken Taco", "Beef Taco", "Veggie Taco", "Spicy Taco", "Shrimp Taco", "BBQ Taco", "Egg Taco"};
    static String burgers[] = {"Beef Burger", "Veg Burger", "Cheese Burger", "Chicken Burger", "Grilled Burger", "Double Patty Burger", "Paneer Burger", "Spicy Burger", "Fish Burger", "Bacon Burger"};
    static String hotdogs[] = {"Classic Hotdog", "Cheese Hotdog", "Chili Hotdog", "Bacon Hotdog", "Veg Hotdog", "Jumbo Hotdog", "Grilled Hotdog", "Stuffed Hotdog", "Spicy Hotdog", "Garlic Hotdog"};
    static String energyDrinks[] = {"Red Bull", "Monster", "Gatorade", "Powerade", "Burn", "Tzinga", "Sting", "B-Fizz", "Electral", "Revive"};
    static String infusedWaters[] = {"Cucumber Mint", "Lemon Basil", "Orange Rosemary", "Ginger Lime", "Cinnamon Apple", "Berry Splash", "Mango Mint", "Tulsi Lemon", "Rose Water", "Herbal Infused"};
    static String shots[] = {"Espresso Shot", "Wheatgrass Shot", "Ginger Shot", "Amla Shot", "Lemon Honey Shot", "Aloe Vera Shot", "Chili Shot", "Beetroot Shot", "Spinach Shot", "Energy Shot"};
    static String barSnacks[] = {"Peanuts", "Chips", "Nachos", "Popcorn", "Chicken Nuggets", "Onion Rings", "Fried Olives", "Masala Papad", "Garlic Bread", "Cheese Cubes"};
    static String buffetItems[] = {"Salad Bar", "Live Pasta", "Dessert Counter", "Soup Station", "Grill Counter", "Chaat Counter", "Rice & Curry", "Bread Basket", "Fruit Station", "Cold Cuts"};

public static void main(String[] args) {

        System.out.println(smoothies[0] + ", " + smoothies[1] + ", " + smoothies[2] + ", " + smoothies[3] + ", " + smoothies[4] + ", " + smoothies[5] + ", " + smoothies[6] + ", " + smoothies[7] + ", " + smoothies[8] + ", " + smoothies[9]);
        System.out.println(appetizers[0] + ", " + appetizers[1] + ", " + appetizers[2] + ", " + appetizers[3] + ", " + appetizers[4] + ", " + appetizers[5] + ", " + appetizers[6] + ", " + appetizers[7] + ", " + appetizers[8] + ", " + appetizers[9]);
        System.out.println(noodleDishes[0] + ", " + noodleDishes[1] + ", " + noodleDishes[2] + ", " + noodleDishes[3] + ", " + noodleDishes[4] + ", " + noodleDishes[5] + ", " + noodleDishes[6] + ", " + noodleDishes[7] + ", " + noodleDishes[8] + ", " + noodleDishes[9]);
        System.out.println(riceBowls[0] + ", " + riceBowls[1] + ", " + riceBowls[2] + ", " + riceBowls[3] + ", " + riceBowls[4] + ", " + riceBowls[5] + ", " + riceBowls[6] + ", " + riceBowls[7] + ", " + riceBowls[8] + ", " + riceBowls[9]);
        System.out.println(wraps[0] + ", " + wraps[1] + ", " + wraps[2] + ", " + wraps[3] + ", " + wraps[4] + ", " + wraps[5] + ", " + wraps[6] + ", " + wraps[7] + ", " + wraps[8] + ", " + wraps[9]);
        System.out.println(stews[0] + ", " + stews[1] + ", " + stews[2] + ", " + stews[3] + ", " + stews[4] + ", " + stews[5] + ", " + stews[6] + ", " + stews[7] + ", " + stews[8] + ", " + stews[9]);
        System.out.println(bakes[0] + ", " + bakes[1] + ", " + bakes[2] + ", " + bakes[3] + ", " + bakes[4] + ", " + bakes[5] + ", " + bakes[6] + ", " + bakes[7] + ", " + bakes[8] + ", " + bakes[9]);
        System.out.println(kebabs[0] + ", " + kebabs[1] + ", " + kebabs[2] + ", " + kebabs[3] + ", " + kebabs[4] + ", " + kebabs[5] + ", " + kebabs[6] + ", " + kebabs[7] + ", " + kebabs[8] + ", " + kebabs[9]);
        System.out.println(tandooriItems[0] + ", " + tandooriItems[1] + ", " + tandooriItems[2] + ", " + tandooriItems[3] + ", " + tandooriItems[4] + ", " + tandooriItems[5] + ", " + tandooriItems[6] + ", " + tandooriItems[7] + ", " + tandooriItems[8] + ", " + tandooriItems[9]);
        System.out.println(sizzlers[0] + ", " + sizzlers[1] + ", " + sizzlers[2] + ", " + sizzlers[3] + ", " + sizzlers[4] + ", " + sizzlers[5] + ", " + sizzlers[6] + ", " + sizzlers[7] + ", " + sizzlers[8] + ", " + sizzlers[9]);
        
    }
}
