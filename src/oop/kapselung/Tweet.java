package oop.kapselung;

public class Tweet {
    private static int maxLength = 140;

    private final String user;
    private final String message;

    public Tweet(String user, String message) {
        this.user = user;
        
        if (message.length() > Tweet.maxLength) {
            this.message = message.substring(0, Tweet.maxLength);
        } else {
            this.message = message;
        }
    }

    public static int getMaxLength() {
        return maxLength;
    }

    public static void setMaxLength(int maxLength) {
        if (maxLength >= 10) {
            Tweet.maxLength = maxLength;
        }
    }

    public String getUser() {
        return this.user;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        return this.user + ": " + this.message;
    }
}
