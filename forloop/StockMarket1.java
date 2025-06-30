class StockMarket1 {

    static String itStocks[] = {
        "TCS", "Infosys", "Wipro", "Tech Mahindra", "HCL Technologies",
        "L&T Infotech", "Mphasis", "Mindtree", "Oracle Financial", "Birlasoft"
    };

    static String bankingStocks[] = {
        "HDFC Bank", "ICICI Bank", "Axis Bank", "SBI", "Kotak Mahindra Bank",
        "IndusInd Bank", "Bandhan Bank", "Yes Bank", "IDFC First Bank", "Punjab National Bank"
    };

    static String energyStocks[] = {
        "Reliance Industries", "ONGC", "GAIL", "Indian Oil", "BPCL",
        "HPCL", "NTPC", "Tata Power", "Adani Green", "JSW Energy"
    };

    static String fmcgStocks[] = {
        "Hindustan Unilever", "ITC", "Nestle India", "Dabur", "Britannia",
        "Marico", "Godrej Consumer", "Colgate-Palmolive", "Emami", "Hatsun Agro"
    };

    static String pharmaStocks[] = {
        "Sun Pharma", "Dr. Reddy’s", "Cipla", "Divi's Labs", "Biocon",
        "Lupin", "Zydus Life", "Torrent Pharma", "Alkem", "Aurobindo Pharma"
    };

    static String autoStocks[] = {
        "Maruti Suzuki", "Tata Motors", "Mahindra & Mahindra", "Eicher Motors", "Hero MotoCorp",
        "TVS Motor", "Ashok Leyland", "Bajaj Auto", "SML Isuzu", "Force Motors"
    };

    static String telecomStocks[] = {
        "Bharti Airtel", "Vodafone Idea", "Reliance Jio (via RIL)", "Tejas Networks", "MTNL",
        "HFCL", "Sterlite Technologies", "Indus Towers", "Tata Communications", "RailTel"
    };

    static String realEstateStocks[] = {
        "DLF", "Godrej Properties", "Oberoi Realty", "Prestige Estates", "Sobha Ltd",
        "Phoenix Mills", "Brigade Enterprises", "Sunteck Realty", "Puravankara", "Mahindra Lifespace"
    };

    static String steelStocks[] = {
        "Tata Steel", "JSW Steel", "SAIL", "Jindal Steel", "NMDC",
        "APL Apollo", "Ratnamani Metals", "Godawari Power", "Vedanta", "Maharashtra Seamless"
    };

    static String chemicalStocks[] = {
        "Pidilite", "Aarti Industries", "Deepak Nitrite", "Navin Fluorine", "SRF",
        "Tata Chemicals", "Atul Ltd", "Vinati Organics", "Laxmi Organic", "Balaji Amines"
    };

    static String aviationStocks[] = {
        "IndiGo", "SpiceJet", "Jet Airways", "Tata-Air India (Group)", "Go First",
        "Blue Dart", "Deccan Aviation", "Global Vectra", "InterGlobe Aviation", "TAAL Enterprises"
    };

    static String cementStocks[] = {
        "Ultratech Cement", "Shree Cement", "Ambuja Cement", "ACC", "JK Cement",
        "Ramco Cements", "Dalmia Bharat", "India Cements", "Heidelberg Cement", "Orient Cement"
    };

    static String logisticsStocks[] = {
        "Blue Dart", "Allcargo Logistics", "Container Corp", "TCI Express", "Mahindra Logistics",
        "Delhivery", "VRL Logistics", "GATI", "Navkar Corp", "Transport Corp"
    };

    static String insuranceStocks[] = {
        "HDFC Life", "SBI Life", "ICICI Lombard", "New India Assurance", "Star Health",
        "Max Financial", "LIC", "Bajaj Finserv", "Reliance General", "Tata AIG"
    };

    static String retailStocks[] = {
        "Avenue Supermarts", "Future Retail", "Trent", "V-Mart", "Aditya Birla Fashion",
        "Shoppers Stop", "Pantaloons", "Metro Brands", "V2 Retail", "Nykaa"
    };

    static String hospitalityStocks[] = {
        "Indian Hotels", "EIH", "Lemon Tree", "TajGVK", "Chalet Hotels",
        "Royal Orchid", "Mahindra Holidays", "Thomas Cook", "Wonderla", "Club Mahindra"
    };

    static String techServiceStocks[] = {
        "Infosys", "TCS", "Wipro", "Tech Mahindra", "Persistent Systems",
        "Zensar Tech", "NIIT", "Coforge", "eClerx", "Happiest Minds"
    };

    static String defenseStocks[] = {
        "HAL", "Bharat Electronics", "BEML", "Mazagon Dock", "Cochin Shipyard",
        "Bharat Dynamics", "Garden Reach", "Paras Defence", "Astra Microwave", "Solar Industries"
    };

    static String mediaStocks[] = {
        "Zee Entertainment", "Sun TV", "Network 18", "TV18 Broadcast", "Dish TV",
        "TV Today", "Den Networks", "Hathway", "Inox Leisure", "PVR"
    };

    static String infrastructureStocks[] = {
        "L&T", "IRB Infra", "NCC", "Ashoka Buildcon", "GMR Infra",
        "Adani Ports", "Welspun Corp", "NBCC", "Kalpataru Power", "KNR Constructions"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("IT Stocks:");
        for(String stock : itStocks) {
            System.out.println(stock);
        }

        System.out.println("Banking Stocks:");
        for(String stock : bankingStocks) {
            System.out.println(stock);
        }

        System.out.println("Energy Stocks:");
        for(String stock : energyStocks) {
            System.out.println(stock);
        }

        System.out.println("FMCG Stocks:");
        for(String stock : fmcgStocks) {
            System.out.println(stock);
        }

        System.out.println("Pharma Stocks:");
        for(String stock : pharmaStocks) {
            System.out.println(stock);
        }

        System.out.println("Auto Stocks:");
        for(String stock : autoStocks) {
            System.out.println(stock);
        }

        System.out.println("Telecom Stocks:");
        for(String stock : telecomStocks) {
            System.out.println(stock);
        }

        System.out.println("Real Estate Stocks:");
        for(String stock : realEstateStocks) {
            System.out.println(stock);
        }

        System.out.println("Steel Stocks:");
        for(String stock : steelStocks) {
            System.out.println(stock);
        }

        System.out.println("Chemical Stocks:");
        for(String stock : chemicalStocks) {
            System.out.println(stock);
        }

        System.out.println("Aviation Stocks:");
        for(String stock : aviationStocks) {
            System.out.println(stock);
        }

        System.out.println("Cement Stocks:");
        for(String stock : cementStocks) {
            System.out.println(stock);
        }

        System.out.println("Logistics Stocks:");
        for(String stock : logisticsStocks) {
            System.out.println(stock);
        }

        System.out.println("Insurance Stocks:");
        for(String stock : insuranceStocks) {
            System.out.println(stock);
        }

        System.out.println("Retail Stocks:");
        for(String stock : retailStocks) {
            System.out.println(stock);
        }

        System.out.println("Hospitality Stocks:");
        for(String stock : hospitalityStocks) {
            System.out.println(stock);
        }

        System.out.println("Tech Service Stocks:");
        for(String stock : techServiceStocks) {
            System.out.println(stock);
        }

        System.out.println("Defense Stocks:");
        for(String stock : defenseStocks) {
            System.out.println(stock);
        }

        System.out.println("Media Stocks:");
        for(String stock : mediaStocks) {
            System.out.println(stock);
        }

        System.out.println("Infrastructure Stocks:");
        for(String stock : infrastructureStocks) {
            System.out.println(stock);
        }

        System.out.println("main ended");
    }
}
