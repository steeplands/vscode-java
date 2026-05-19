package oop.kapselung;

public class TwitterWallTester {

    public static void main(String[] args) {

        System.out.println("=== TESTING TWEET CLASS ===");

        // Default max length
        System.out.println("Default max tweet length: " + Tweet.getMaxLength());

        // Create tweets
        Tweet t1 = new Tweet("John", "Hello World!");
        Tweet t2 = new Tweet("Marie", "Java is fun.");
        Tweet t3 = new Tweet("Max", "This is a test tweet.");

        // Print tweets
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        // Change max length
        Tweet.setMaxLength(50);
        System.out.println("\nNew max tweet length: " + Tweet.getMaxLength());

        // Create another tweet after changing max length
        Tweet t4 = new Tweet("Lisa",
                "This tweet was created after changing the max length.");

        System.out.println(t4);

        // Try invalid max length
        Tweet.setMaxLength(5);
        System.out.println("Max length after invalid change attempt: "
                + Tweet.getMaxLength());



        System.out.println("\n=== TESTING TWITTER WALL ===");

        // Minimum allowed size is 10
        TwitterWall wall = new TwitterWall(10);

        // Create more tweets for testing overwrite behavior
        Tweet t5 = new Tweet("Tom", "Tweet 5");
        Tweet t6 = new Tweet("Eva", "Tweet 6");
        Tweet t7 = new Tweet("Paul", "Tweet 7");
        Tweet t8 = new Tweet("Mia", "Tweet 8");
        Tweet t9 = new Tweet("Luca", "Tweet 9");
        Tweet t10 = new Tweet("Sarah", "Tweet 10");
        Tweet t11 = new Tweet("Chris", "Tweet 11");



        System.out.println("\n--- Adding 10 Tweets ---");

        wall.addTweet(t1);
        wall.addTweet(t2);
        wall.addTweet(t3);
        wall.addTweet(t4);
        wall.addTweet(t5);
        wall.addTweet(t6);
        wall.addTweet(t7);
        wall.addTweet(t8);
        wall.addTweet(t9);
        wall.addTweet(t10);

        printWall(wall);



        System.out.println("\n--- Adding 11th Tweet (oldest should be overwritten) ---");

        wall.addTweet(t11);

        printWall(wall);



        System.out.println("\n=== CLEAR WALL ===");

        wall.clearWall();

        printWall(wall);

        System.out.println("History should still exist:");
        System.out.println("Tweets ever added: "
                + wall.getNrOfTweetsInHistory());



        System.out.println("\n=== RESET WALL ===");

        wall.resetWall();

        printWall(wall);

        System.out.println("History should now be 0:");
        System.out.println("Tweets ever added: "
                + wall.getNrOfTweetsInHistory());
    }



    // Helper method for output
    public static void printWall(TwitterWall wall) {

        System.out.println("Wall size: " + wall.getWallSize());
        System.out.println("Tweets currently in wall: "
                + wall.getNrOfTweetsInWall());
        System.out.println("Tweets ever added: "
                + wall.getNrOfTweetsInHistory());

        System.out.println("Stored tweets:");

        Tweet[] tweets = wall.getTweets();

        for (int i = 0; i < tweets.length; i++) {
            System.out.println((i + 1) + ". " + tweets[i]);
        }
    }
}