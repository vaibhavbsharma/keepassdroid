package com.keepassdroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import com.android.keepass.R;
/**
 * Created by vaibhav on 3/4/17.
 */

public class EntryEditGDFragment extends Fragment {
    private final String ENTRYEDITACTIVITY="ENTRYEDITACTIVITY";

    private final String ENTRYEDITACTIVITY_SAVE_BUTTON="ENTRYEDITACTIVITY_save_button";
    private final String ENTRYEDITACTIVITY_CANCEL_BUTTON="ENTRYEDITACTIVITY_cancel_button";

    public EntryEditGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_ENTRYEDITACTIVITY = getActivity().findViewById(R.id.ENTRYEDITACTIVITY);

        /*ENTRYEDITACTIVITY_SAVE_BUTTON*/
        View gV_next_button = getActivity().findViewById(R.id.entry_save);
        gV_next_button.setClickable(true);
        gV_next_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_next_button = new GestureListener(ENTRYEDITACTIVITY_SAVE_BUTTON);
        final GestureDetector gD_next_button = new GestureDetector(getActivity(), gL_next_button);
        gV_next_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_next_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*ENTRYEDITACTIVITY_CANCEL_BUTTON*/
        View gV_cancel_button = getActivity().findViewById(R.id.entry_cancel);
        gV_cancel_button.setClickable(true);
        gV_cancel_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_cancel_button = new GestureListener(ENTRYEDITACTIVITY_SAVE_BUTTON);
        final GestureDetector gD_cancel_button = new GestureDetector(getActivity(), gL_cancel_button);
        gV_cancel_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_cancel_button.onTouchEvent(motionEvent);
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
