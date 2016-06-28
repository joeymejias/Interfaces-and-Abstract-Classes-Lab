package com.company;

/**
 * Created by joey on 6/28/16.
 */
public class LG extends Remote {
    public LG(boolean needsBatteries, boolean supportsUsb) {
        super(needsBatteries, supportsUsb);
    }

    @Override
    public void channelUp() {
        System.out.println("*Click* (Channel goes up!)");
    }

    @Override
    public void channelDown() {
        System.out.println("*Click* (Channel goes down!)");
    }

    @Override
    public void volumeUp() {
        System.out.println("*Click* (So loud!)");
    }

    @Override
    public void volumeDown() {
        System.out.println("*Click* (Why is this so quiet?)");
    }

    @Override
    public boolean isWaterProof() {
        return false;
    }

    @Override
    public void suportsBrands() {

    }

    @Override
    public boolean isRechargeable() {
        return false;
    }

    @Override
    public void startScan(String string) {

    }
}
