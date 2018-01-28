package org.bottomnav.examples;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.bottomnav.BottomNavMenuItem;
import org.bottomnav.OnClickItemListener;
import org.bottomnav.examples.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ObservableList<BottomNavMenuItem> items = new ObservableArrayList<>();
    private OnClickItemListener listener = new OnClickItemListener() {
        @Override
        public void onClickItem(View v, int position) {
            System.out.println(position);
        }
    };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setActivity(this);

        items.add(BottomNavMenuItem.create().setIcon(android.R.drawable.star_big_off).setTitle("Test"));
    }

    public ObservableList<BottomNavMenuItem> getItems() {
        return items;
    }

    public OnClickItemListener getListener() {
        return listener;
    }
}
