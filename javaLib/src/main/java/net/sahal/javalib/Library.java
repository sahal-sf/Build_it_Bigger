package net.sahal.javalib;

public class Library {

    private static String[] jokes = {
            "Grandpa’s last words will stay with me forever: Quit rattlin, the ladder ya little hooligan!",
            "I saw an ad recently: LASER HAIR REMOVAL. But come on, if you had laser hair, would you really want to remove them? No, you’d be starting world domination!",
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
            "One of the most wonderful things in life is to wake up and enjoy a cuddle with somebody; unless you are in prison."};
    private static int index = 0;

    public static String getJoke(){
        if(index >= jokes.length) {
            index = 0;
        }
        return jokes[index++];
    }
}
