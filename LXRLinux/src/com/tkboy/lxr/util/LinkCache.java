package com.tkboy.lxr.util;

import java.util.HashMap;
import java.util.Iterator;

import android.util.Log;

public final class LinkCache {
    private static final String TAG = "LXR";
    
    private HashMap<String, Link> map;
    
    private static LinkCache mInstance;
    
    private LinkCache() {
        map = new HashMap<String, Link>();
    }
    
    public static LinkCache getInstance() {
        if (mInstance == null) {
            mInstance = new LinkCache();
        }
        return mInstance;
    }
    
    public static Link getLinkStatic(String t) {
        LinkCache instance = getInstance();
        if (instance != null) {
            return instance.getLink(t);
        }
        return null;
    }
    
    public Link getLink(String t) {
        Link l = map.get(t);
        if (l == null){
            l = new Link(t);
            map.put(t, l);
            dammy();
        }
        return l;
    }
    
    public void dammy() {
        Log.d(TAG, "        dammy Links in Cache");
        Log.d(TAG, "------------------------------------");
        Log.d(TAG, "  all = " + map.size());
        Iterator<Link> it = map.values().iterator();
        while(it.hasNext()) {
            Link l = it.next();
            l.dummy();
        }
        Log.d(TAG, "------------------------------------");
    }
}
