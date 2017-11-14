package com.pyarinc.pageradapterupdate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by user2 on 11/14/2017.
 */

public class ImageAdapter extends FragmentStatePagerAdapter {

    public ImageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ImageLoadingFragment.newInstance(Singleton.mUrls.get(position),"");
    }

    @Override
    public int getCount() {
        return Singleton.mUrls.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
