package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class Motherboard {
    private String mModel;
    private String mManufacturer;
    private int mRamSlots;
    private int mCardSlots;
    private String mBios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        mModel = model;
        mManufacturer = manufacturer;
        mRamSlots = ramSlots;
        mCardSlots = cardSlots;
        mBios = bios;
    }

    public String getModel() {
        return mModel;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public int getRamSlots() {
        return mRamSlots;
    }

    public int getCardSlots() {
        return mCardSlots;
    }

    public String getBios() {
        return mBios;
    }
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");

    }
}
