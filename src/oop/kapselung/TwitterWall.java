package oop.kapselung;

public class TwitterWall {
    private Tweet[] tweets;
    private int tweetInkre = 0;
    private int TweetHistory = 0;

    public TwitterWall(int wallSize) {
        if (wallSize >= 10) {
            this.tweets = new Tweet[wallSize];
        } else {
            this.tweets = new Tweet[10];
        }
    }

    public void addTweet(Tweet tweetToAdd) {
        if (this.tweetInkre == this.getWallSize()) {
            this.tweetInkre = 0;
        }

        this.tweets[this.tweetInkre++] = tweetToAdd;
        this.TweetHistory++;
    }

    public int getWallSize() {
        return this.tweets.length;
    }

    public int getNrOfTweetsInWall() {
        if (this.TweetHistory < this.getWallSize()) {
            return this.TweetHistory;
        } else {
            return this.getWallSize();
        }
    }

    public int getNrOfTweetsInHistory() {
        return this.TweetHistory;
    }

    public Tweet[] getTweets() {
        Tweet[] ausgabe = new Tweet[this.getNrOfTweetsInWall()];
        int idx = this.tweetInkre - 1;
        for (int i = 0; i < ausgabe.length; i++) {
            if (idx < 0) {
                idx = this.getWallSize() - 1;
            }
            ausgabe[i] = this.tweets[idx];
            idx--;
        }
        return ausgabe;
    }

    public void clearWall() {
        this.tweets = new Tweet[this.getWallSize()];
        this.tweetInkre = 0;
    }

    public void resetWall() {
        this.clearWall();
        this.TweetHistory = 0;
    }

}
