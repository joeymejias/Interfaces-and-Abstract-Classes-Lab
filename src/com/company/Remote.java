package com.company;

/**
 * Created by joey on 6/28/16.
 */
public abstract class Remote implements WaterProof,Rechargeable, Universal, FingerPrintScanner {
    boolean mNeedsBatteries;
    boolean mSupportsUsb;

    public Remote(boolean needsBatteries, boolean supportsUsb){
        mNeedsBatteries = needsBatteries;
        mSupportsUsb = supportsUsb;
    }

    public void getBatteries(){
        System.out.println("Got the batteries!");
    }

    public void setBatteries(){
        System.out.println("Batteries are in!");
    }

    public abstract void channelUp();

    public abstract void channelDown();

    public abstract void volumeUp();

    public abstract void volumeDown();

    public void powerButtonPressed(){
        System.out.println("Power on!");
    }

    public String numberButtonPressed(int buttonNumber){
        return "Changing channel to " + buttonNumber;
    }

}
