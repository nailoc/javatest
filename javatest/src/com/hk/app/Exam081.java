package com.hk.app;

import java.util.ArrayList;

public class Exam081 {
	
	private String customProperty;

    public Exam081(String property) {
        this.customProperty = property;
    }

    public String getCustomProperty() {
        return this.customProperty;
    }

    public static void main(String[] args) {

        ArrayList<Exam081> list = new ArrayList<>();
        list.add(new Exam081("Z"));
        list.add(new Exam081("A"));
        list.add(new Exam081("B"));
        list.add(new Exam081("X"));
        list.add(new Exam081("Aa"));

        list.sort((o1, o2) -> o1.getCustomProperty().compareTo(o2.getCustomProperty()));

        for (Exam081 obj : list) {
            System.out.println(obj.getCustomProperty());
        }
    }

}
