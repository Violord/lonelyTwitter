package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yhou5 on 9/15/16.
 */
public abstract class Tweet {
    private String message;
    private Date date;
    private ArrayList<Mood> mood;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
        this.mood = new ArrayList<Mood>();
    }

    public Tweet(String message, Date date){

        this.message = message;
        this.date = date;
        this.mood = new ArrayList<Mood>();
    }

    public abstract Boolean isImportant();

    public void setMessage(String message) throws TweetTooLongException {
        if(message.length()>140){
            //Do something!
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }


}
