class SocialMedial {

    static String messagingApps[] = {
        "WhatsApp", "Telegram", "Signal", "WeChat", "Messenger",
        "Viber", "Line", "Kik", "Snapchat", "Discord",
        "Skype", "Google Chat", "Threema", "Element", "IMO"
    };

    static String videoPlatforms[] = {
        "YouTube", "TikTok", "Instagram Reels", "Facebook Watch", "Twitch",
        "Vimeo", "Dailymotion", "Bigo Live", "Likee", "MX TakaTak",
        "Zili", "Triller", "Roposo", "Chingari", "YouNow"
    };

    static String photoSharingApps[] = {
        "Instagram", "Pinterest", "Snapchat", "Flickr", "500px",
        "Imgur", "Photobucket", "VSCO", "Retrica", "EyeEm",
        "SmugMug", "Cluster", "Google Photos", "BeReal", "Dispo"
    };

    static String businessNetworks[] = {
        "LinkedIn", "Xing", "Opportunity", "Lunchclub", "Shapr",
        "AngelList", "Jobcase", "Bark", "Meetup", "Viadeo",
        "Ripple", "Alignable", "Bizzabo", "Coworker", "Handshake"
    };

    static String bloggingPlatforms[] = {
        "Tumblr", "Medium", "WordPress", "Blogger", "Ghost",
        "Typepad", "Wix", "Weebly", "Substack", "Dev.to",
        "Write.as", "Svbtle", "HubPages", "Jekyll", "Steemit"
    };

    static String microBlogging[] = {
        "Twitter", "Threads", "Mastodon", "Plurk", "Gab",
        "Parler", "Cohost", "Truth Social", "CounterSocial", "Gettr",
        "WT.Social", "Twetch", "Aether", "Scuttlebutt", "Lemmy"
    };

    static String audioBasedPlatforms[] = {
        "Clubhouse", "Spotify Greenroom", "Twitter Spaces", "Discord", "Stereo",
        "Anchor", "Castbox", "Breaker", "Podbean", "Audacy",
        "Buzzsprout", "Resonate", "Podomatic", "Riverside", "RedCircle"
    };

    static String datingApps[] = {
        "Tinder", "Bumble", "Hinge", "OkCupid", "Plenty of Fish",
        "Grindr", "Her", "Coffee Meets Bagel", "Happn", "Match",
        "eHarmony", "BLK", "Christian Mingle", "Badoo", "Taimi"
    };

    static String communityForums[] = {
        "Reddit", "Quora", "Stack Overflow", "Discord", "4chan",
        "8kun", "Slashdot", "Voat", "Fark", "Something Awful",
        "Hacker News", "Lemmy", "Disqus", "MetaFilter", "Tildes"
    };

    static String eCommerceSocial[] = {
        "Facebook Marketplace", "Instagram Shopping", "Pinterest", "Meesho", "Flipkart Social",
        "Amazon Live", "Shopify Collabs", "TaoBao Live", "Poshmark", "Etsy Social",
        "Trell", "Whatnot", "Depop", "Flip", "NTWRK"
    };

    static String kidsSafePlatforms[] = {
        "YouTube Kids", "PopJam", "Kudos", "Messenger Kids", "GoBubble",
        "Togetherville", "Kidzworld", "PBS Kids", "LEGO Life", "Scratch",
        "BrainPOP", "Animal Jam", "Nick", "Funbrain", "ABCmouse"
    };

    static String encryptedPlatforms[] = {
        "Signal", "Telegram (Secret Chat)", "Session", "Threema", "Wire",
        "Element", "Wickr Me", "Silent Phone", "Briar", "Olvid",
        "Tox", "Jami", "Status", "Keybase", "Delta Chat"
    };

    static String regionalPlatforms[] = {
        "WeChat (China)", "VK (Russia)", "Line (Japan)", "KakaoTalk (Korea)", "Zalo (Vietnam)",
        "Hike (India)", "Sina Weibo (China)", "QQ (China)", "MiTalk", "Naver Band",
        "Mxit", "Tuenti", "Renren", "Path", "Vero"
    };

    static String liveStreaming[] = {
        "Twitch", "YouTube Live", "Facebook Live", "Instagram Live", "Periscope",
        "YouNow", "Tango", "LiveMe", "V Live", "StreamYard",
        "Streamlabs", "Restream", "Mobcrush", "Caffeine", "BigO Live"
    };

    static String anonymousApps[] = {
        "Yik Yak", "Whisper", "Ask.fm", "Sarahah", "Tellonym",
        "NGL", "Sendit", "LMK", "Honesty", "Rumor",
        "Wink", "Lipsi", "Q&A", "Sayat.me", "CuriousCat"
    };

    static String memeCommunities[] = {
        "iFunny", "9GAG", "Memedroid", "Cheezburger", "Mematic",
        "Imgur", "Reddit (r/memes)", "Dankland", "Meme Generator", "Know Your Meme",
        "Trollhub", "LOL Pics", "MeMe Live", "GiggleMug", "Zomboid"
    };

    static String fitnessCommunities[] = {
        "MyFitnessPal", "Strava", "Fitocracy", "BodySpace", "Nike Run Club",
        "Runkeeper", "JEFIT", "MapMyRun", "Zwift", "Peloton",
        "Runtastic", "FitOn", "Trainerize", "Sweat", "Aaptiv"
    };

    static String educationalPlatforms[] = {
        "Khan Academy", "Coursera", "Udemy", "edX", "Skillshare",
        "BYJU'S", "Unacademy", "Duolingo", "Brilliant", "SoloLearn",
        "Google Classroom", "ClassDojo", "Canvas", "Moodle", "TED-Ed"
    };

    static String AIPlatforms[] = {
        "Character.AI", "Replika", "ChatGPT", "Jasper AI", "Copy.ai",
        "Synthesia", "DALL·E", "RunwayML", "Perplexity", "Claude",
        "Wordtune", "Notion AI", "Quillbot", "Writesonic", "HeyGen"
    };

    static String metaverseApps[] = {
        "Decentraland", "Sandbox", "Horizon Worlds", "Roblox", "Second Life",
        "VRChat", "Somnium Space", "AltspaceVR", "Mozilla Hubs", "Rec Room",
        "Upland", "High Fidelity", "Facebook Spaces", "NeosVR", "Engage"
    };

    public static void main(String[] args) {
        System.out.println("main started");

        System.out.println("Messaging Apps:");
        for(String item : messagingApps) {
            System.out.println(item);
        }

        System.out.println("Video Platforms:");
        for(String item : videoPlatforms) {
            System.out.println(item);
        }

        System.out.println("Photo Sharing Apps:");
        for(String item : photoSharingApps) {
            System.out.println(item);
        }

        System.out.println("Business Networks:");
        for(String item : businessNetworks) {
            System.out.println(item);
        }

        System.out.println("Blogging Platforms:");
        for(String item : bloggingPlatforms) {
            System.out.println(item);
        }

        System.out.println("Microblogging Platforms:");
        for(String item : microBlogging) {
            System.out.println(item);
        }

        System.out.println("Audio Based Platforms:");
        for(String item : audioBasedPlatforms) {
            System.out.println(item);
        }

        System.out.println("Dating Apps:");
        for(String item : datingApps) {
            System.out.println(item);
        }

        System.out.println("Community Forums:");
        for(String item : communityForums) {
            System.out.println(item);
        }

        System.out.println("E-Commerce Social Platforms:");
        for(String item : eCommerceSocial) {
            System.out.println(item);
        }

        System.out.println("Kids Safe Platforms:");
        for(String item : kidsSafePlatforms) {
            System.out.println(item);
        }

        System.out.println("Encrypted Platforms:");
        for(String item : encryptedPlatforms) {
            System.out.println(item);
        }

        System.out.println("Regional Platforms:");
        for(String item : regionalPlatforms) {
            System.out.println(item);
        }

        System.out.println("Live Streaming Platforms:");
        for(String item : liveStreaming) {
            System.out.println(item);
        }

        System.out.println("Anonymous Social Apps:");
        for(String item : anonymousApps) {
            System.out.println(item);
        }

        System.out.println("Meme Communities:");
        for(String item : memeCommunities) {
            System.out.println(item);
        }

        System.out.println("Fitness Communities:");
        for(String item : fitnessCommunities) {
            System.out.println(item);
        }

        System.out.println("Educational Platforms:");
        for(String item : educationalPlatforms) {
            System.out.println(item);
        }

        System.out.println("AI Platforms:");
        for(String item : AIPlatforms) {
            System.out.println(item);
        }

        System.out.println("Metaverse Apps:");
        for(String item : metaverseApps) {
            System.out.println(item);
        }

        System.out.println("main ended");
    }
}
