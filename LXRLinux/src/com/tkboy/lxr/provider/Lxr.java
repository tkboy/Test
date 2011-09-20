package com.tkboy.lxr.provider;

import org.w3c.dom.Text;

import com.tkboy.lxr.util.Link;

import android.content.ContentResolver;
import android.database.Cursor;

public final class Lxr {
    
    public static final Cursor queryFile(ContentResolver cr, 
                    String version, String file) {
        return null;
    }
    
    public static final Cursor queryDir(ContentResolver cr, 
                    String version, String dir) {
        return null;
    }
    
    public static final Cursor querySearch(ContentResolver cr, 
            String version, String keyword) {
        return null;
    }
    
    public static final Cursor queryVersion(ContentResolver cr, 
            String version, String keyword) {
        return null;
    }
    
    public static final Cursor queryAmbig(ContentResolver cr, 
            String version, String ambig) {
        return null;
    }
    
    class Text {
        private Node mNodes;
        
        class Node {
            private String mText;
            private Link mLink;
            private Node mNext;
        }
        
        public Text(String t) {
            
        }
        
        public String toString() {
            return null;
        }
        
    }
}
