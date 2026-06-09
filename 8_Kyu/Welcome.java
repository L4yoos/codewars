// https://www.codewars.com/kata/577ff15ad648a14b780000e7

// Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.
//
// The Task
//  Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
//  Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
// The Database
//  Please modify this as appropriate for your language.

public class Welcome {
    public static String greet(String language) {
        String greet = "";
        switch (language) {
            case "english":
                greet = "Welcome";
                break;
            case "czech":
                greet = "Vitejte";
                break;
            case "danish":
                greet = "Velkomst";
                break;
            case "dutch":
                greet = "Welkom";
                break;
            case "estonian":
                greet = "Tere tulemast";
                break;
            case "finnish":
                greet = "Tervetuloa";
                break;
            case "flemish":
                greet = "Welgekomen";
                break;
            case "french":
                greet = "Bienvenue";
                break;
            case "german":
                greet = "Willkommen";
                break;
            case "irish":
                greet = "Failte";
                break;
            case "italian":
                greet = "Benvenuto";
                break;
            case "latvian":
                greet = "Gaidits";
                break;
            case "lithuanian":
                greet = "Laukiamas";
                break;
            case "polish":
                greet = "Witamy";
                break;
            case "spanish":
                greet = "Bienvenido";
                break;
            case "swedish":
                greet = "Valkommen";
                break;
            case "welsh":
                greet = "Croeso";
                break;
            default:
                greet = "Welcome";
                break;
        }
        return greet;
    }
}