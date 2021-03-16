package model;

import java.util.ArrayList;

public class ConsoleBank 
{
    public static final ArrayList<GameConsole> database = new ArrayList<>();
    // private static String keyword;
    static
    {
        var c1 = new HomeConsole("Playstation 4", "CUH-12XX");
        c1.addFeatures("HD Capabilities");
        c1.addFeatures("Capacities: 500Gb to 1TB");
        c1.addFeatures("Base Firmware: 1.01");
        c1.addFeatures("Support basic VR");
        database.add(c1);

        var c2 = new HomeConsole("Playstation 4 Slim: ", "CUH-20XX");
        database.add(c2);
        c2.addFeatures("Identical to " + c1.name + " " + c1.id);
        c2.addFeatures("Minimal form factor design");

        var c3 = new HomeConsole("Playstation 4 Pro: ", "CUH-70XX");
        database.add(c3);
        c3.addFeatures("4K video capabilities");
        c3.addFeatures("60 frame per second capabilities");
        c3.addFeatures("Supports high definition VR");
        c3.addFeatures("Capacities: 1TB to 2TB");

        var c4 = new HomeConsole("Playstation 5: ", "CFI-100X");
        database.add(c4);
        c4.addFeatures("8K video capabilities");
        c4.addFeatures("120 frame per second capabilities");
        c4.addFeatures("Support adaptive trigger ");
        c4.addFeatures("Capacities: 825GB");

        var c5 = new MobileConsole("Nintendo Switch: ", "NX", "6.2", "4hrs");
        database.add(c5);
        
        var c6 = new MobileConsole("Nintendo Switch V2: ", "NX-2", "6.2", "6hrs");
        database.add(c6);

        var c7 = new MobileConsole("SmartPhone: ", "varies", "varies", "varies");
        database.add(c7);

    }


    // public static ArrayList<GameConsole> searchConsole ()
    // {
    //     var result = new ArrayList<GameConsole>();
    //     for(var c: database)
    //     {
    //         if(c.name.contains(keyword))
    //         {
    //             result.add(c);
    //         }
    //     }
    //     return result;
    // }

    // public static ArrayList<GameConsole> tempDB = searchConsole();

    // public static String setKeyword(String key)
    // {
    //     return keyword = key;
    // }
}
