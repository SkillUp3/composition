package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Monitor {

    private String mModel;
    private String mManufacturer;
    private int mSize;
    private Resolution mNativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        mModel = model;
        mManufacturer = manufacturer;
        mSize = size;
        mNativeResolution = nativeResolution;
    }

    public String getModel() {
        return mModel;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public int getSize() {
        return mSize;
    }

    public Resolution getNativeResolution() {
        return mNativeResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }
}
