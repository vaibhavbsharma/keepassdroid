package com.keepassdroid.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import com.android.keepass.R;
import com.keepassdroid.GestureListener;

/**
 * Created by vaibhav on 3/4/17.
 */

public class PwEntryViewGDFragment extends Fragment {


    View ev;
    private final String GROUPACTIVITY_add_entry="GROUPACTIVITY_add_entry";

    public PwEntryViewGDFragment(View _ev){ev = _ev;}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*add_entry button*/
        View gV_add_entry = ev;
        gV_add_entry.setClickable(true);
        gV_add_entry.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_add_entry = new GestureListener(GROUPACTIVITY_add_entry);
        final GestureDetector gD_add_entry = new GestureDetector(getActivity(), gL_add_entry);
        gV_add_entry.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_add_entry.onTouchEvent(motionEvent);
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
