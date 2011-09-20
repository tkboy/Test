package com.tkboy.lxr.provider.web;

import java.util.HashMap;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class LxrProvider extends ContentProvider {

    public static final String AUTHORITY = "com.tkboy.lxr";

    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY);
    public static final Uri FILE_URI = Uri.parse("content://" + AUTHORITY + "/file");
    public static final Uri DIR_URI = Uri.parse("content://" + AUTHORITY + "/dir");
    public static final Uri CODE_URI = Uri.parse("content://" + AUTHORITY + "/code");
    public static final Uri VERSION_URI = Uri.parse("content://" + AUTHORITY + "/version");
    public static final Uri AMBIG_URI = Uri.parse("content://" + AUTHORITY + "/ambig");
    
    // march code
    public static final int FILE = 1;
    public static final int DIR = 2;
    public static final int CODE = 3;
    public static final int VERSION = 4;
    public static final int AMBIG = 5;
    
    private static final HashMap<String, String> sFileProjectionMap;
    private static final HashMap<String, String> sDirProjectionMap;
    private static final HashMap<String, String> sCodeProjectionMap;
    private static final HashMap<String, String> sVersionProjectionMap;
    private static final HashMap<String, String> sAmbigProjectionMap;
    private static final UriMatcher sUriMatcher;
    static {
        sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        sUriMatcher.addURI(AUTHORITY, "file", FILE);
        sUriMatcher.addURI(AUTHORITY, "dir", DIR);
        sUriMatcher.addURI(AUTHORITY, "code", CODE);
        sUriMatcher.addURI(AUTHORITY, "version", VERSION);
        sUriMatcher.addURI(AUTHORITY, "ambig", AMBIG);
        
        sFileProjectionMap = new HashMap<String, String>();
        sFileProjectionMap.put(FileColumns.LINE, FileColumns.LINE);
        sFileProjectionMap.put(FileColumns.NAME_ID, FileColumns.NAME_ID);
        sFileProjectionMap.put(FileColumns.TYPE, FileColumns.TYPE);
        sFileProjectionMap.put(FileColumns.TEXT, FileColumns.TEXT);
        sDirProjectionMap = new HashMap<String, String>();
        sCodeProjectionMap = new HashMap<String, String>();
        sVersionProjectionMap = new HashMap<String, String>();
        sAmbigProjectionMap = new HashMap<String, String>();
    }
    
    /**
     * <a href="mm/memory.c#L32" id="L32" class="line" name="L32">  32</a><span class="comment"> * 05.04.94  -  Multi-page memory management added for v1.1.</span>
     * 
     */
    public interface FileColumns {
        public static final String LINE = "line";
        public static final String NAME_ID = "name";
        public static final String TYPE = "type";
        public static final int TYPE_CODE = 0;
        public static final int TYPE_COMMENT = 1;
        public static final String TEXT = "text";
    }
    /**
    <tr class="node">
    <td class="name">
      <a href="mm/Kconfig.debug" class="fref">Kconfig.debug</a></td>

    <td class="size">908</td>
    <td class="time">2011-05-18 19:06:42 -0700</td>
    <td class="desc"></td>
    </tr>
    
    */
    public interface DirColumns {
        public static final String NAME = "name";
        public static final String SIZE = "size";
        public static final String TIME = "time";
        public static final String DESC = "desc";
    }
    
    public interface CodeColumns {
        
    }
    
    public interface VersionColumns {
        public static final String VALUE = "value";
        public static final String TEXT = "text";
    }
    
    public interface AmbigColumns {
        
    }

    
    @Override
    public boolean onCreate() {
        return false;
    }
    
    @Override
    public String getType(Uri uri) {
        int match = sUriMatcher.match(uri);
        switch (match) {
        case FILE:
            return "vnd.android.cursor.dir/file";
        case DIR:
            return "vnd.android.cursor.dir/dir";
        case CODE:
            return "vnd.android.cursor.dir/code";
        case VERSION:
            return "vnd.android.cursor.dir/version";
        case AMBIG:
            return "vnd.android.cursor.dir/ambig";
        default:
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }
    
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs,
            String sortOrder) {
        int match = sUriMatcher.match(uri);
        switch (match) {
        case FILE:
            
        case DIR:

        case CODE:

        case VERSION:

        case AMBIG:

        default:
            throw new IllegalArgumentException("Unknown URI " + uri);
        }
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }
    
    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
    
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }
}
