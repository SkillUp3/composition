package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Dimensions {

    private int mWidth;
    private int mHeight;
    private int mDepth;

    public Dimensions(int width, int height, int depth) {
        mWidth = width;
        mHeight = height;
        mDepth = depth;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getHeight() {
        return mHeight;
    }

    public int getDepth() {
        return mDepth;
    }
}
