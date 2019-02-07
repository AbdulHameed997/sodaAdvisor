package com.example.sodaadvisor;

import java.util.ArrayList;

public class sodaExpert {
    public ArrayList<String> getFlavour(String sodaType) {
        ArrayList<String> flavours = new ArrayList<String>();
        if (sodaType.equals("Mirenda")) {
            flavours.add("Orange");
            flavours.add("Apple");
        } else {
            flavours.add("Cola");
            flavours.add("Pepsi");
        }
        return flavours;
    }
}
