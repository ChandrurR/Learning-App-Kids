package com.news.learningappkids;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

class Myadapter extends FragmentStateAdapter
{

    public Myadapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 0:return new AlaphetFragment();
            case 1:return new FruitFragment();
            case 2:return new AnimalFragment();


        }
        return new AlaphetFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
