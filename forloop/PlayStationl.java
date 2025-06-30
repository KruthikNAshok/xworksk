class PlayStationl {

    static String actionGames[] = {
        "God of War", "Spider-Man", "Ghost of Tsushima", "Uncharted 4", "The Last of Us",
        "Bloodborne", "Infamous Second Son", "Control", "Returnal", "Horizon Zero Dawn"
    };

    static String racingGames[] = {
        "Gran Turismo 7", "Need for Speed Heat", "F1 22", "WRC 10", "Dirt 5",
        "Crash Team Racing", "Wreckfest", "Hot Wheels Unleashed", "GRID Legends", "MotoGP 22"
    };

    static String shootingGames[] = {
        "Call of Duty: Modern Warfare", "Battlefield V", "Far Cry 6", "Destiny 2",
        "Resident Evil Village", "Apex Legends", "Warframe", "DOOM Eternal", "Borderlands 3", "Metro Exodus"
    };

    static String openWorldGames[] = {
        "Red Dead Redemption 2", "Assassin's Creed Valhalla", "Watch Dogs: Legion",
        "Days Gone", "Cyberpunk 2077", "GTA V", "Immortals Fenyx Rising", "Mafia Definitive Edition",
        "Just Cause 4", "Biomutant"
    };

    static String sportsGames[] = {
        "FIFA 23", "NBA 2K23", "MLB The Show 22", "eFootball PES", "WWE 2K22",
        "NHL 22", "UFC 4", "Cricket 22", "Tennis World Tour 2", "Golf PGA Tour 2K23"
    };

    static String horrorGames[] = {
        "Resident Evil 2", "Resident Evil 7", "Until Dawn", "The Evil Within 2",
        "Outlast 2", "Little Nightmares II", "The Quarry", "Martha Is Dead", "Amnesia Rebirth", "Tormented Souls"
    };

    static String adventureGames[] = {
        "It Takes Two", "A Plague Tale: Innocence", "Stray", "Life is Strange", "Firewatch",
        "Journey", "Outer Wilds", "The Pathless", "What Remains of Edith Finch", "Sea of Solitude"
    };

    static String rpgGames[] = {
        "Elden Ring", "Final Fantasy XV", "Persona 5 Royal", "Tales of Arise", "The Witcher 3",
        "Cyberpunk 2077", "Dragon Age: Inquisition", "Horizon Forbidden West", "Nioh 2", "Mass Effect Legendary Edition"
    };

    static String platformerGames[] = {
        "Sackboy: A Big Adventure", "Ratchet & Clank", "Crash Bandicoot 4", "LittleBigPlanet 3",
        "Ori and the Blind Forest", "Rayman Legends", "Spyro Reignited", "Celeste", "Cuphead", "Trine 4"
    };

    static String puzzleGames[] = {
        "Tetris Effect", "The Witness", "Inside", "Unravel Two", "Baba Is You",
        "The Talos Principle", "Superliminal", "Manifold Garden", "Fez", "Limbo"
    };

    static String animeGames[] = {
        "Dragon Ball Z: Kakarot", "Naruto Shippuden: Ultimate Ninja Storm 4", "One Piece Pirate Warriors 4",
        "Attack on Titan 2", "My Hero One’s Justice 2", "Demon Slayer: Kimetsu no Yaiba", "JoJo’s Bizarre Adventure",
        "Sword Art Online", "Fairy Tail", "Kill la Kill - IF"
    };

    static String indieGames[] = {
        "Hades", "Dead Cells", "Hollow Knight", "Cuphead", "Slay the Spire",
        "Undertale", "Stardew Valley", "Spiritfarer", "Kena: Bridge of Spirits", "Oxenfree"
    };

    static String simulationGames[] = {
        "The Sims 4", "Cities Skylines", "Planet Coaster", "Farming Simulator 22", "Train Sim World 3",
        "Car Mechanic Simulator", "House Flipper", "Microsoft Flight Simulator", "Two Point Hospital", "Goat Simulator 3"
    };

    static String strategyGames[] = {
        "XCOM 2", "Civilization VI", "Disgaea 5", "Worms Battlegrounds", "Mutant Year Zero",
        "This War of Mine", "Desperados III", "Shadow Tactics", "Skulls of the Shogun", "Tiny Tactics"
    };

    static String multiplayerGames[] = {
        "Fortnite", "Apex Legends", "Rocket League", "Call of Duty: Warzone", "Overcooked! 2",
        "Fall Guys", "Among Us", "Minecraft", "Ghost of Tsushima: Legends", "Splitgate"
    };

    static String fightingGames[] = {
        "Tekken 7", "Mortal Kombat 11", "Street Fighter V", "Injustice 2", "Guilty Gear Strive",
        "Dragon Ball FighterZ", "BlazBlue", "Soulcalibur VI", "Dead or Alive 6", "Brawlhalla"
    };

    static String stealthGames[] = {
        "Hitman 3", "Dishonored 2", "Metal Gear Solid V", "Assassin’s Creed Odyssey", "Thief",
        "Mark of the Ninja", "Sniper Elite 4", "Aragami", "Styx: Shards of Darkness", "Shadow Tactics"
    };

    static String vrGames[] = {
        "Astro Bot Rescue Mission", "Beat Saber", "Moss", "Iron Man VR", "Skyrim VR",
        "Resident Evil 4 VR", "Star Wars Squadrons", "Blood & Truth", "Superhot VR", "Tetris Effect Connected"
    };

    static String kidsGames[] = {
        "Paw Patrol", "Peppa Pig", "LEGO Harry Potter", "LEGO Marvel Super Heroes", "Cars 3",
        "Crash Bandicoot N. Sane Trilogy", "Rayman Legends", "SpongeBob SquarePants", "Slime Rancher", "Toy Story 3"
    };

    static String exclusiveGames[] = {
        "Returnal", "Ratchet & Clank: Rift Apart", "Demon’s Souls", "Spider-Man: Miles Morales", "Gran Turismo 7",
        "Astro’s Playroom", "Ghost of Tsushima", "The Last of Us Part II", "Horizon Forbidden West", "Uncharted: Lost Legacy"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        for (String game : actionGames) {
            System.out.println(game);
        }
        for (String game : racingGames) {
            System.out.println(game);
        }
        for (String game : shootingGames) {
            System.out.println(game);
        }
        for (String game : openWorldGames) {
            System.out.println(game);
        }
        for (String game : sportsGames) {
            System.out.println(game);
        }
        for (String game : horrorGames) {
            System.out.println(game);
        }
        for (String game : adventureGames) {
            System.out.println(game);
        }
        for (String game : rpgGames) {
            System.out.println(game);
        }
        for (String game : platformerGames) {
            System.out.println(game);
        }
        for (String game : puzzleGames) {
            System.out.println(game);
        }
        for (String game : animeGames) {
            System.out.println(game);
        }
        for (String game : indieGames) {
            System.out.println(game);
        }
        for (String game : simulationGames) {
            System.out.println(game);
        }
        for (String game : strategyGames) {
            System.out.println(game);
        }
        for (String game : multiplayerGames) {
            System.out.println(game);
        }
        for (String game : fightingGames) {
            System.out.println(game);
        }
        for (String game : stealthGames) {
            System.out.println(game);
        }
        for (String game : vrGames) {
            System.out.println(game);
        }
        for (String game : kidsGames) {
            System.out.println(game);
        }
        for (String game : exclusiveGames) {
            System.out.println(game);
        }

        System.out.println("main ended");
    }
}
