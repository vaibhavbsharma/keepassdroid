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

public class GeneratePasswordGDFragment extends Fragment {

    private final String GENERATEPASSWORD_accept_button="GENERATEPASSWORD_accept_button";
    private final String GENERATEPASSWORD_cancel_button="GENERATEPASSWORD_cancel_button";
    private final String GENERATEPASSWORD_generate_password_button="GENERATEPASSWORD_generate_password_button";
    
    public GeneratePasswordGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /*accept_button*/
        View gV_accept_button = getActivity().findViewById(R.id.accept_button);
        gV_accept_button.setClickable(true);
        gV_accept_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_accept_button = new GestureListener(GENERATEPASSWORD_accept_button);
        final GestureDetector gD_accept_button = new GestureDetector(getActivity(), gL_accept_button);
        gV_accept_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_accept_button.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*cancel_button*/
        View gV_cancel_button = getActivity().findViewById(R.id.cancel_button);
        gV_cancel_button.setClickable(true);
        gV_cancel_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_cancel_button = new GestureListener(GENERATEPASSWORD_cancel_button);
        final GestureDetector gD_cancel_button = new GestureDetector(getActivity(), gL_cancel_button);
        gV_cancel_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_cancel_button.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*generate_password_button*/
        View gV_generate_password_button = getActivity().findViewById(R.id.generate_password_button);
        gV_generate_password_button.setClickable(true);
        gV_generate_password_button.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_generate_password_button = new GestureListener(GENERATEPASSWORD_generate_password_button);
        final GestureDetector gD_generate_password_button = new GestureDetector(getActivity(), gL_generate_password_button);
        gV_generate_password_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_generate_password_button.onTouchEvent(motionEvent);
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
