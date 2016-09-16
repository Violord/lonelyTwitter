package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yhou5 on 9/15/16.
 */
public class Glad extends Mood {

    public Glad(String mood){
        super(mood);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
