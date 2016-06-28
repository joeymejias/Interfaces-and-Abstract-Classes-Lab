package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Remote> remotes = new ArrayList<>();

        remotes.add(new Samsung(false, false));
        remotes.add(new Sony(false, false));
        remotes.add(new LG(false, false));
        remotes.add(new GenericBrand(false, false));
        remotes.add(new GeneralElectric(false, false));
        remotes.add(new Zenith(false, false));

        int i = 0;
        for (Remote remote : remotes) {
            remote.startScan("bacon");
            remote.powerButtonPressed();
            System.out.println(remote.numberButtonPressed(i));
            i++;
            remote.channelUp();
            remote.channelDown();
            remote.volumeUp();
            remote.volumeDown();
        }
    }
}
