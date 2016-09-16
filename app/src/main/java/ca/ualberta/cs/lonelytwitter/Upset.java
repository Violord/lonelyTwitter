package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yhou5 on 9/15/16.
 */
public class Upset extends Mood {

    public Upset(String mood){
        super(mood);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

}
