package com.keepassdroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.android.keepass.R;

/**
 * Created by vaibhav on 3/4/17.
 */

public class EntryGDFragment extends Fragment {

    private final String ENTRYACTIVITY_menu_toggle_pass="ENTRYACTIVITY_menu_toggle_pass";
    public EntryGDFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setHasOptionsMenu(false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*menu_toggle_pass*/
        View gV_menu_toggle_pass = getActivity().findViewById(R.id.menu_toggle_pass);
        gV_menu_toggle_pass.setClickable(true);
        gV_menu_toggle_pass.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_menu_toggle_pass = new GestureListener(ENTRYACTIVITY_menu_toggle_pass);
        final GestureDetector gD_menu_toggle_pass = new GestureDetector(getActivity(), gL_menu_toggle_pass);
        gV_menu_toggle_pass.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_menu_toggle_pass.onTouchEvent(motionEvent);
                return false;
            }
        });

        // END_INCLUDE(init_detector)
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*if (item.getItemId() == R.id.sample_action) {
            clearLog();
        }*/
        return true;
    }

    public void clearLog() {
        /*LogFragment logFragment =  ((LogFragment) getActivity().getSupportFragmentManager()
                .findFragmentById(R.id.log_fragment));
        logFragment.getLogView().setText("");*/
    }
}
