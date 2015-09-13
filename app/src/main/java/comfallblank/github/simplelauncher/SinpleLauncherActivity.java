package comfallblank.github.simplelauncher;


import android.app.Fragment;
import android.os.Bundle;
import android.view.Window;

import comfallblank.github.simplelauncher.fragments.SimpleLauncherFragment;

public class SinpleLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new SimpleLauncherFragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
    }
}
