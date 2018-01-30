package com.nickchi.photogallery;

import android.net.Uri;

/**
 * Created by Nick on 20.01.2018.
 */

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOvner;

    @Override
    public String toString() {
        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public void setOwner(String owner) {
        mOvner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOvner)
                .appendPath(mId)
                .build();
    }
}
