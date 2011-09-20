package com.tkboy.lxr.util;

import android.util.Log;

public class Link {
    private static final String TAG = "LXR";
    private String mName = null;
    private String mValue = null;
    private int mType = 0;
    public Link(String t) {
        
    }
    
    public void dummy() {
        Log.d(TAG, String.format("%1$24s%2$s", mName, mValue));
    }
}
