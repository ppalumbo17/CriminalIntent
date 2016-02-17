package criminalintent.android.bignerdranch.com.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Peter on 2/4/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;


    public Crime(){
        //Generate Unique Identifier
        mId = UUID.randomUUID();
        mDate = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d YYYY");
//        mDate = formatter.format(mDate);
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }
    public void setDate(Date date) {
        mDate = date;
    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
