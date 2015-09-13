package comfallblank.github.simplelauncher;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/**
 * Created by fallb on 2015/8/28.
 * Desription:this is a super activity class,it can hold a fragment
 */
public abstract class SingleFragmentActivity extends Activity {

    //sub class must override this method,so the activity can knoew which fragment it wants hold
    protected abstract Fragment createFragment();

    //To provide own layout,sub-class must override this method.
    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }
}
