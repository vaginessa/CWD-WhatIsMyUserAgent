//package org.diego.android.crosswalkdemo;
package og.cgrx.android.WIMUA;

import android.os.Bundle;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;


public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        xWalkWebView=(XWalkView)findViewById(R.id.xwalkWebView);

        // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
    }

    @Override
    protected void onXWalkReady() {
        // Do anything with embedding API

//        xWalkWebView.load("http://192.168.1.12/sofosplayermini.html", null);
//        xWalkWebView.load("https://www.youtube.com/watch?v=X1IW8MplZGw", null);
// not working        xWalkWebView.load("https://www.youtube.com/v/X1IW8MplZGw", null);
//        xWalkWebView.load("https://www.youtube.com/embed/X1IW8MplZGw?rel=0&showinfo=0&autoplay=1", null);
//        xWalkWebView.load("http://rwills.xpat.it/device", null);
        xWalkWebView.load("http://whatsmyuseragent.com/", null);
// rel=0 removes related videos (thumbnails) at the end of the video
// showinfo=o prevents showing title over the video
// autoplay=1 plays the video automatically - but doesn't work with embedded


    }
}
