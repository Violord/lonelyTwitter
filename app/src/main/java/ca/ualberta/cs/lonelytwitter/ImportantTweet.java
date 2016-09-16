package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yhou5 on 9/15/16.
 */
public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
