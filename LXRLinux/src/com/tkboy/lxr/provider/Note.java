package com.tkboy.lxr.provider;

import android.net.Uri;

public final class Note {
    
    public static final String AUTHORITY = "com.tkboy.lxr";
    
    public static final Uri CONTENT_URI = 
                    Uri.parse("content://" + AUTHORITY);
}
