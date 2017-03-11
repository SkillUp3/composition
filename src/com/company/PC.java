package com.company;

/**
 * Created by ian on 10/03/2017.
 */
public class PC {

    private Case mCase;
    private Monitor mMonitor;
    private Motherboard mMotherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        mCase = aCase;
        mMonitor = monitor;
        mMotherboard = motherboard;
    }

    public Case getCase() {
        return mCase;
    }

    public Monitor getMonitor() {
        return mMonitor;
    }

    public Motherboard getMotherboard() {
        return mMotherboard;
    }
}
