package oop.kapselung;

public class TweetTester {

    public static void main(String[] args) {

        // Standard-MaxLength testen
        Tweet t1 = new Tweet(
                "Flo",
                "Hallo das ist ein normaler Tweet."
        );

        System.out.println("Tweet 1:");
        System.out.println(t1);
        System.out.println();


        // Zu langer Tweet bei 140 Zeichen
        String longText =
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
              + "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        Tweet t2 = new Tweet("Max", longText);

        System.out.println("Tweet 2:");
        System.out.println(t2);
        System.out.println("Länge: " + t2.getMessage().length());
        System.out.println();


        // Neue Maximallänge setzen
        Tweet.setMaxLength(20);

        Tweet t3 = new Tweet(
                "Anna",
                "Dieser Tweet ist definitiv länger als zwanzig Zeichen."
        );

        System.out.println("Tweet 3:");
        System.out.println(t3);
        System.out.println("Länge: " + t3.getMessage().length());
        System.out.println();


        // Prüfen ob alte Tweets unverändert bleiben
        System.out.println("Alter Tweet bleibt gleich:");
        System.out.println(t1);
        System.out.println();


        // Ungültige Maximallänge testen
        Tweet.setMaxLength(5);

        System.out.println("Aktuelle MaxLength:");
        System.out.println(Tweet.getMaxLength());
    }
}