class PeriodicTablel {

    static String alkaliMetals[] = {
        "Lithium", "Sodium", "Potassium", "Rubidium", "Cesium",
        "Francium", "Hydrogen", "Ununennium", "Element 119", "Element 120",
        "Unknown1", "Unknown2", "Unknown3", "Unknown4", "Unknown5"
    };

    static String alkalineEarthMetals[] = {
        "Beryllium", "Magnesium", "Calcium", "Strontium", "Barium",
        "Radium", "Element 121", "Element 122", "Element 123", "Element 124",
        "Unknown1", "Unknown2", "Unknown3", "Unknown4", "Unknown5"
    };

    static String transitionMetals[] = {
        "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese",
        "Iron", "Cobalt", "Nickel", "Copper", "Zinc",
        "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium"
    };

    static String postTransitionMetals[] = {
        "Aluminum", "Gallium", "Indium", "Tin", "Thallium",
        "Lead", "Bismuth", "Polonium", "Flerovium", "Livermorium",
        "Element 113", "Element 114", "Element 115", "Element 116", "Element 117"
    };

    static String metalloids[] = {
        "Boron", "Silicon", "Germanium", "Arsenic", "Antimony",
        "Tellurium", "Astatine", "Element 118", "Unknown1", "Unknown2",
        "Unknown3", "Unknown4", "Unknown5", "Unknown6", "Unknown7"
    };

    static String nobleGases[] = {
        "Helium", "Neon", "Argon", "Krypton", "Xenon",
        "Radon", "Oganesson", "Element 119", "Unknown1", "Unknown2",
        "Unknown3", "Unknown4", "Unknown5", "Unknown6", "Unknown7"
    };

    static String lanthanides[] = {
        "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium",
        "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium",
        "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium"
    };

    static String actinides[] = {
        "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium",
        "Plutonium", "Americium", "Curium", "Berkelium", "Californium",
        "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium"
    };

    static String syntheticElements[] = {
        "Technetium", "Promethium", "Astatine", "Francium", "Neptunium",
        "Plutonium", "Americium", "Curium", "Berkelium", "Californium",
        "Einsteinium", "Fermium", "Mendelevium", "Nobelium", "Lawrencium"
    };

    static String radioactiveElements[] = {
        "Polonium", "Radon", "Radium", "Actinium", "Thorium",
        "Uranium", "Neptunium", "Plutonium", "Americium", "Curium",
        "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium"
    };

    static String gaseousElements[] = {
        "Hydrogen", "Helium", "Nitrogen", "Oxygen", "Fluorine",
        "Neon", "Chlorine", "Argon", "Krypton", "Xenon",
        "Radon", "Oganesson", "Unknown1", "Unknown2", "Unknown3"
    };

    static String solidElements[] = {
        "Lithium", "Beryllium", "Carbon", "Sodium", "Magnesium",
        "Aluminum", "Silicon", "Phosphorus", "Sulfur", "Potassium",
        "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium"
    };

    static String liquidElements[] = {
        "Mercury", "Bromine", "Element 118", "Unknown1", "Unknown2",
        "Unknown3", "Unknown4", "Unknown5", "Unknown6", "Unknown7",
        "Unknown8", "Unknown9", "Unknown10", "Unknown11", "Unknown12"
    };

    static String reactiveElements[] = {
        "Fluorine", "Chlorine", "Oxygen", "Sodium", "Potassium",
        "Rubidium", "Cesium", "Francium", "Lithium", "Calcium",
        "Barium", "Radium", "Aluminum", "Magnesium", "Hydrogen"
    };

    static String nonMetals[] = {
        "Hydrogen", "Carbon", "Nitrogen", "Oxygen", "Fluorine",
        "Phosphorus", "Sulfur", "Chlorine", "Selenium", "Bromine",
        "Iodine", "Astatine", "Radon", "Helium", "Neon"
    };

    static String discoveredIn18thCentury[] = {
        "Hydrogen", "Nitrogen", "Oxygen", "Chlorine", "Cobalt",
        "Nickel", "Manganese", "Molybdenum", "Tungsten", "Tellurium",
        "Bismuth", "Uranium", "Zirconium", "Titanium", "Boron"
    };

    static String discoveredIn19thCentury[] = {
        "Aluminum", "Calcium", "Lithium", "Sodium", "Potassium",
        "Barium", "Strontium", "Magnesium", "Chromium", "Vanadium",
        "Selenium", "Iodine", "Ruthenium", "Thallium", "Cesium"
    };

    static String discoveredIn20thCentury[] = {
        "Francium", "Neptunium", "Plutonium", "Americium", "Curium",
        "Berkelium", "Californium", "Einsteinium", "Fermium", "Mendelevium",
        "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium"
    };

    static String naturallyOccurring[] = {
        "Hydrogen", "Helium", "Carbon", "Nitrogen", "Oxygen",
        "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum",
        "Silicon", "Phosphorus", "Sulfur", "Chlorine", "Potassium"
    };

    static String manMadeElements[] = {
        "Technetium", "Promethium", "Neptunium", "Plutonium", "Americium",
        "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium",
        "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Alkali Metals:");
        for(String item : alkaliMetals) {
            System.out.println(item);
        }

        System.out.println("Alkaline Earth Metals:");
        for(String item : alkalineEarthMetals) {
            System.out.println(item);
        }

        System.out.println("Transition Metals:");
        for(String item : transitionMetals) {
            System.out.println(item);
        }

        System.out.println("Post Transition Metals:");
        for(String item : postTransitionMetals) {
            System.out.println(item);
        }

        System.out.println("Metalloids:");
        for(String item : metalloids) {
            System.out.println(item);
        }

        System.out.println("Noble Gases:");
        for(String item : nobleGases) {
            System.out.println(item);
        }

        System.out.println("Lanthanides:");
        for(String item : lanthanides) {
            System.out.println(item);
        }

        System.out.println("Actinides:");
        for(String item : actinides) {
            System.out.println(item);
        }

        System.out.println("Synthetic Elements:");
        for(String item : syntheticElements) {
            System.out.println(item);
        }

        System.out.println("Radioactive Elements:");
        for(String item : radioactiveElements) {
            System.out.println(item);
        }

        System.out.println("Gaseous Elements:");
        for(String item : gaseousElements) {
            System.out.println(item);
        }

        System.out.println("Solid Elements:");
        for(String item : solidElements) {
            System.out.println(item);
        }

        System.out.println("Liquid Elements:");
        for(String item : liquidElements) {
            System.out.println(item);
        }

        System.out.println("Reactive Elements:");
        for(String item : reactiveElements) {
            System.out.println(item);
        }

        System.out.println("Non-Metals:");
        for(String item : nonMetals) {
            System.out.println(item);
        }

        System.out.println("Discovered in 18th Century:");
        for(String item : discoveredIn18thCentury) {
            System.out.println(item);
        }

        System.out.println("Discovered in 19th Century:");
        for(String item : discoveredIn19thCentury) {
            System.out.println(item);
        }

        System.out.println("Discovered in 20th Century:");
        for(String item : discoveredIn20thCentury) {
            System.out.println(item);
        }

        System.out.println("Naturally Occurring:");
        for(String item : naturallyOccurring) {
            System.out.println(item);
        }

        System.out.println("Man-Made Elements:");
        for(String item : manMadeElements) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
