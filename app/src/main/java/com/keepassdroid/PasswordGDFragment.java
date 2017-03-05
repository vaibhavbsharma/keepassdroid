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


public class PasswordGDFragment extends Fragment {

    private final String PASSWORDACTIVITY_password="PASSWORDACTIVITY_password";
    private final String PASSWORDACTIVITY_pass_keyfile="PASSWORDACTIVITY_pass_keyfile";
    private final String PASSWORDACTIVITY_pass_ok="PASSWORDACTIVITY_pass_ok";

    public PasswordGDFragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //View gV_ENTRYEDITACTIVITY = getActivity().findViewById(R.id.ENTRYEDITACTIVITY);

        /*password edittext*/
        View gV_password = getActivity().findViewById(R.id.password);
        gV_password.setClickable(true);
        gV_password.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_password = new GestureListener(PASSWORDACTIVITY_password);
        final GestureDetector gD_password = new GestureDetector(getActivity(), gL_password);
        gV_password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_password.onTouchEvent(motionEvent);
                return false;
            }
        });
        
        /*pass_keyfile edittext*/
        View gV_pass_keyfile = getActivity().findViewById(R.id.pass_keyfile);
        gV_pass_keyfile.setClickable(true);
        gV_pass_keyfile.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_pass_keyfile = new GestureListener(PASSWORDACTIVITY_pass_keyfile);
        final GestureDetector gD_pass_keyfile = new GestureDetector(getActivity(), gL_pass_keyfile);
        gV_pass_keyfile.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_pass_keyfile.onTouchEvent(motionEvent);
                return false;
            }
        });

        /*password ok button*/
        View gV_pass_ok = getActivity().findViewById(R.id.pass_ok);
        gV_pass_ok.setClickable(true);
        gV_pass_ok.setFocusable(true);
        GestureDetector.SimpleOnGestureListener gL_pass_ok = new GestureListener(PASSWORDACTIVITY_pass_ok);
        final GestureDetector gD_pass_ok = new GestureDetector(getActivity(), gL_pass_ok);
        gV_pass_ok.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gD_pass_ok.onTouchEvent(motionEvent);
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
