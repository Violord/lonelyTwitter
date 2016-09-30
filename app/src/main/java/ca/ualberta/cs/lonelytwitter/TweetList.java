package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by makepeac on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }


    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void addTweet(Tweet tweet) {
        if(tweets.contains(tweet)){
            throw new IllegalArgumentException();
        }else{
        tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }


    public int getCount(){return tweets.size();}

    public ArrayList getTweets() {
        for(int i=0;i<tweets.size();i++){
            for(int j=i;j<tweets.size();j++){
                if(tweets.get(j).getDate().compareTo(tweets.get(j+1).getDate()) == 1){
                    Tweet temp = tweets.get(j);
                    tweets.set(j, tweets.get(j+1));
                    tweets.set(j+1, temp);
                }
            }
        }
        return tweets;
    }

}
