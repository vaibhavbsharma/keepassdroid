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

    private final String ENTRYEDITACTIVITY_SAVE_BUTTON="ENTRYEDITACTIVITY_save_button";
    private final String ENTRYEDITACTIVITY_CANCEL_BUTTON="ENTRYEDITACTIVITY_cancel_button";
    private final String ENTRYEDITACTIVITY_ENTRY_TITLE="ENTRYEDITACTIVITY_entry_title";
    private final String ENTRYEDITACTIVITY_ENTRY_USER_NAME="ENTRYEDITACTIVITY_entry_user_name";
    private final String ENTRYEDITACTIVITY_ENTRY_URL="ENTRYEDITACTIVITY_entry_url";
    private final String ENTRYEDITACTIVITY_generate_button="ENTRYEDITACTIVITY_generate_button";

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

        /*SAVE_BUTTON*/
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

        /*CANCEL_BUTTON*/
        View gV_cancel_button = getActivity().findViewById(R.id.entry_cancel);
        gV_cancel_button.setClickable(true);
        gV_cancel_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_cancel_button = new GestureListener(ENTRYEDITACTIVITY_CANCEL_BUTTON);
        final GestureDetector gD_cancel_button = new GestureDetector(getActivity(), gL_cancel_button);
        gV_cancel_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_cancel_button.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*entry_title*/
        View gV_entry_title = getActivity().findViewById(R.id.entry_title);
        gV_entry_title.setClickable(true);
        gV_entry_title.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_entry_title = new GestureListener(ENTRYEDITACTIVITY_ENTRY_TITLE);
        final GestureDetector gD_entry_title = new GestureDetector(getActivity(), gL_entry_title);
        gV_entry_title.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_entry_title.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*entry_user_name*/
        View gV_entry_user_name = getActivity().findViewById(R.id.entry_user_name);
        gV_entry_user_name.setClickable(true);
        gV_entry_user_name.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_entry_user_name = new GestureListener(ENTRYEDITACTIVITY_ENTRY_USER_NAME);
        final GestureDetector gD_entry_user_name = new GestureDetector(getActivity(), gL_entry_user_name);
        gV_entry_user_name.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_entry_user_name.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*entry_url*/
        View gV_entry_url = getActivity().findViewById(R.id.entry_url);
        gV_entry_url.setClickable(true);
        gV_entry_url.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_entry_url = new GestureListener(ENTRYEDITACTIVITY_ENTRY_URL);
        final GestureDetector gD_entry_url = new GestureDetector(getActivity(), gL_entry_url);
        gV_entry_url.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_entry_url.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*generate_button*/
        View gV_generate_button = getActivity().findViewById(R.id.generate_button);
        gV_generate_button.setClickable(true);
        gV_generate_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_generate_button = new GestureListener(ENTRYEDITACTIVITY_generate_button);
        final GestureDetector gD_generate_button = new GestureDetector(getActivity(), gL_generate_button);
        gV_generate_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_generate_button.onTouchEvent(motionEvent);
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
