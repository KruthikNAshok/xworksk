class Libraryl {

    static String fictionBooks[] = {
        "To Kill a Mockingbird", "1984", "The Great Gatsby", "Brave New World", "The Catcher in the Rye",
        "The Alchemist", "Little Women", "Jane Eyre", "The Kite Runner", "The Book Thief",
        "The Fault in Our Stars", "A Thousand Splendid Suns", "The Giver", "Life of Pi", "Gone Girl"
    };

    static String nonFictionBooks[] = {
        "Sapiens", "Educated", "Becoming", "The Wright Brothers", "The Immortal Life of Henrietta Lacks",
        "Born a Crime", "Outliers", "Thinking, Fast and Slow", "The Power of Habit", "Steve Jobs",
        "Into the Wild", "Man’s Search for Meaning", "Unbroken", "The Tipping Point", "Quiet"
    };

    static String scienceBooks[] = {
        "A Brief History of Time", "The Selfish Gene", "The Elegant Universe", "Cosmos", "The Gene",
        "The Body", "The Order of Time", "Astrophysics for People in a Hurry", "The Grand Design", "Surely You’re Joking, Mr. Feynman!",
        "Why We Sleep", "The Universe in a Nutshell", "The Origin of Species", "Physics of the Impossible", "The Double Helix"
    };

    static String historyBooks[] = {
        "Guns, Germs, and Steel", "The Silk Roads", "The Diary of Anne Frank", "1776", "The Rise and Fall of the Third Reich",
        "A People's History of the United States", "Team of Rivals", "The Cold War", "SPQR", "The Crusades",
        "The Pioneers", "The Wright Brothers", "India After Gandhi", "Postwar", "Churchill"
    };

    static String biographyBooks[] = {
        "Steve Jobs", "Long Walk to Freedom", "The Diary of a Young Girl", "Elon Musk", "Alexander Hamilton",
        "Becoming", "Benjamin Franklin", "Leonardo da Vinci", "Einstein", "Open",
        "Bossypants", "Educated", "Shoe Dog", "I Am Malala", "Steve Jobs by Walter Isaacson"
    };

    static String childrenBooks[] = {
        "Harry Potter and the Sorcerer’s Stone", "Charlotte’s Web", "Matilda", "The Gruffalo", "The Very Hungry Caterpillar",
        "Where the Wild Things Are", "Green Eggs and Ham", "Diary of a Wimpy Kid", "Percy Jackson", "The Cat in the Hat",
        "Alice in Wonderland", "Holes", "Wonder", "Charlie and the Chocolate Factory", "Coraline"
    };

    static String fantasyBooks[] = {
        "Harry Potter Series", "The Lord of the Rings", "The Hobbit", "A Game of Thrones", "Eragon",
        "The Name of the Wind", "Mistborn", "The Wheel of Time", "The Chronicles of Narnia", "The Magicians",
        "Throne of Glass", "Shadow and Bone", "The Witcher", "Red Queen", "The Golden Compass"
    };

    static String mysteryBooks[] = {
        "Gone Girl", "The Girl with the Dragon Tattoo", "Sherlock Holmes", "And Then There Were None", "Big Little Lies",
        "The Da Vinci Code", "In the Woods", "The Woman in Cabin 10", "The Silent Patient", "The Reversal",
        "The Couple Next Door", "Behind Closed Doors", "Before I Go To Sleep", "Sharp Objects", "The Girl on the Train"
    };

    static String romanceBooks[] = {
        "Pride and Prejudice", "Me Before You", "The Notebook", "Outlander", "The Time Traveler’s Wife",
        "Twilight", "It Ends with Us", "The Rosie Project", "The Hating Game", "Beautiful Disaster",
        "The Kiss Quotient", "One Day", "Beach Read", "After", "Love & Gelato"
    };

    static String horrorBooks[] = {
        "It", "The Shining", "Dracula", "Frankenstein", "Bird Box",
        "Pet Sematary", "The Haunting of Hill House", "House of Leaves", "Carrie", "The Exorcist",
        "Salem's Lot", "Coraline", "World War Z", "The Turn of the Screw", "The Silence of the Lambs"
    };

    static String adventureBooks[] = {
        "Treasure Island", "Life of Pi", "The Odyssey", "Into the Wild", "Journey to the Center of the Earth",
        "Robinson Crusoe", "Moby Dick", "The Call of the Wild", "Around the World in 80 Days", "Hatchet",
        "King Solomon’s Mines", "The Lost World", "The Count of Monte Cristo", "The Three Musketeers", "White Fang"
    };

    static String thrillerBooks[] = {
        "The Girl on the Train", "The Da Vinci Code", "Before I Go To Sleep", "The Silent Patient", "The Couple Next Door",
        "The Reversal", "The Girl with a Clock for a Heart", "I Am Watching You", "The Girl Who Lived", "No Exit",
        "Then She Was Gone", "The Good Daughter", "The Family Upstairs", "The Perfect Nanny", "The Chain"
    };

    static String sciFiBooks[] = {
        "Dune", "Neuromancer", "Ender’s Game", "The Martian", "Snow Crash",
        "Ready Player One", "Hyperion", "Foundation", "Brave New World", "The Left Hand of Darkness",
        "Fahrenheit 451", "I, Robot", "The Time Machine", "Do Androids Dream of Electric Sheep?", "The War of the Worlds"
    };

    static String classicsBooks[] = {
        "To Kill a Mockingbird", "1984", "Pride and Prejudice", "Jane Eyre", "Wuthering Heights",
        "Moby Dick", "Great Expectations", "Crime and Punishment", "Anna Karenina", "The Iliad",
        "The Brothers Karamazov", "The Count of Monte Cristo", "Les Misérables", "A Tale of Two Cities", "The Scarlet Letter"
    };

    static String comicBooks[] = {
        "Batman", "Spider-Man", "X-Men", "Superman", "The Avengers",
        "Deadpool", "Iron Man", "Wonder Woman", "The Flash", "Captain America",
        "Black Panther", "Guardians of the Galaxy", "Aquaman", "Green Lantern", "Thor"
    };

    static String poetryBooks[] = {
        "Milk and Honey", "The Sun and Her Flowers", "Leaves of Grass", "The Waste Land", "Ariel",
        "The Collected Poems of Emily Dickinson", "The Prophet", "The Odyssey", "The Divine Comedy", "Paradise Lost",
        "The Raven", "Howl", "Selected Poems by Robert Frost", "Love Poems", "Devotions"
    };

    static String selfHelpBooks[] = {
        "Atomic Habits", "The Power of Now", "Think and Grow Rich", "The 7 Habits of Highly Effective People", "The Subtle Art of Not Giving a F*ck",
        "How to Win Friends and Influence People", "Awaken the Giant Within", "Can’t Hurt Me", "Mindset", "The Four Agreements",
        "You Are a Badass", "Rich Dad Poor Dad", "Deep Work", "Ikigai", "Make Your Bed"
    };

    static String spiritualBooks[] = {
        "The Bhagavad Gita", "The Bible", "The Quran", "Autobiography of a Yogi", "The Power of Now",
        "The Tao Te Ching", "The Book of Awakening", "The Purpose Driven Life", "Waking Up", "Inner Engineering",
        "Conversations with God", "The Untethered Soul", "Be Here Now", "The Seat of the Soul", "The Miracle of Mindfulness"
    };

    static String travelBooks[] = {
        "Into the Wild", "Eat Pray Love", "The Art of Travel", "On the Road", "Wild",
        "In Patagonia", "Travels with Charley", "The Great Railway Bazaar", "Vagabonding", "Around the World in 80 Days",
        "A Walk in the Woods", "The Beach", "The Lost City of Z", "The Motorcycle Diaries", "Seven Years in Tibet"
    };

    static String educationalBooks[] = {
        "NCERT Science Class 10", "Fundamentals of Physics", "Campbell Biology", "Indian Polity by Laxmikant", "RD Sharma Mathematics",
        "Concepts of Physics by HC Verma", "Organic Chemistry by Morrison & Boyd", "Arihant General Knowledge", "Word Power Made Easy", "Wren & Martin",
        "Mathematics by RS Aggarwal", "Modern ABC Chemistry", "General Science by Lucent", "A Brief History of Modern India", "Oxford English Grammar"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Fiction Books:");
        for(String book : fictionBooks) {
            System.out.println(book);
        }

        System.out.println("Non-Fiction Books:");
        for(String book : nonFictionBooks) {
            System.out.println(book);
        }

        System.out.println("Science Books:");
        for(String book : scienceBooks) {
            System.out.println(book);
        }

        System.out.println("History Books:");
        for(String book : historyBooks) {
            System.out.println(book);
        }

        System.out.println("Biography Books:");
        for(String book : biographyBooks) {
            System.out.println(book);
        }

        System.out.println("Children Books:");
        for(String book : childrenBooks) {
            System.out.println(book);
        }

        System.out.println("Fantasy Books:");
        for(String book : fantasyBooks) {
            System.out.println(book);
        }

        System.out.println("Mystery Books:");
        for(String book : mysteryBooks) {
            System.out.println(book);
        }

        System.out.println("Romance Books:");
        for(String book : romanceBooks) {
            System.out.println(book);
        }

        System.out.println("Horror Books:");
        for(String book : horrorBooks) {
            System.out.println(book);
        }

        System.out.println("Adventure Books:");
        for(String book : adventureBooks) {
            System.out.println(book);
        }

        System.out.println("Thriller Books:");
        for(String book : thrillerBooks) {
            System.out.println(book);
        }

        System.out.println("Sci-Fi Books:");
        for(String book : sciFiBooks) {
            System.out.println(book);
        }

        System.out.println("Classics Books:");
        for(String book : classicsBooks) {
            System.out.println(book);
        }

        System.out.println("Comic Books:");
        for(String book : comicBooks) {
            System.out.println(book);
        }

        System.out.println("Poetry Books:");
        for(String book : poetryBooks) {
            System.out.println(book);
        }

        System.out.println("Self-Help Books:");
        for(String book : selfHelpBooks) {
            System.out.println(book);
        }

        System.out.println("Spiritual Books:");
        for(String book : spiritualBooks) {
            System.out.println(book);
        }

        System.out.println("Travel Books:");
        for(String book : travelBooks) {
            System.out.println(book);
        }

        System.out.println("Educational Books:");
        for(String book : educationalBooks) {
            System.out.println(book);
        }

        System.out.println("main ended");
    }
}
