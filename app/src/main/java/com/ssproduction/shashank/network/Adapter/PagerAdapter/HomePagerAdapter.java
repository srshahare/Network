package com.ssproduction.shashank.network.Adapter.PagerAdapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ssproduction.shashank.network.Fragments.HomeFragments.PhotosFragment;
import com.ssproduction.shashank.network.Fragments.HomeFragments.PollFragment;
import com.ssproduction.shashank.network.Fragments.HomeFragments.QuestionsFragment;
import com.ssproduction.shashank.network.Fragments.HomeFragments.VideosFragment;
import com.ssproduction.shashank.network.R;

public class HomePagerAdapter extends FragmentStatePagerAdapter {

    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                return new PhotosFragment();
            case 1:
                return new VideosFragment();
            case 2:
                return new PollFragment();
            case 3:
                return new QuestionsFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position){
            case 0:
                return "Photos";

            case 1:
                return "Videos";

            case 2:
                return "Poll";

            case 3:
                return "Questions";
            default:
                return null;
        }
    }
}
