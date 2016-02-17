package criminalintent.android.bignerdranch.com.criminalintent;

import android.app.Fragment;

/**
 * Created by Peter on 2/17/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
