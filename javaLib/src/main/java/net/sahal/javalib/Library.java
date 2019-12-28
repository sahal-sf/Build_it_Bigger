package net.sahal.javalib;

public class Library {

    private static String[] jokes = {
            "Time is money. Therefore, ATMs are time machines.",
            "What do you call it when computer science majors make fun of each other?\nCyber boolean.",
            "My iPod is in Titanic mode right now. It is syncing.",
            "I bought a universal remote control today. I’m kind of afraid of myself now…"};
    private static int index = 0;

    public static String getJoke(){
        if(index >= jokes.length) {
            index = 0;
        }
        return jokes[index++];
    }
}
