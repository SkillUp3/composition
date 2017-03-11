package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Case {

    private String mModel;
    private String mManufacturer;
    private String mPowerSupply;
    private Dimensions mDimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        mModel = model;
        mManufacturer = manufacturer;
        mPowerSupply = powerSupply;
        mDimensions = dimensions;
    }

    public String getModel() {
        return mModel;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public String getPowerSupply() {
        return mPowerSupply;
    }

    public Dimensions getDimensions() {
        return mDimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }
}

