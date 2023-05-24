package com.example.knk;

import javafx.scene.layout.HBox;
import javafx.scene.shape.Box;

public class CommonObjects {
    private static CommonObjects commonObject = new CommonObjects();

    private HBox mainBox;

    private CommonObjects(){}
    public static CommonObjects getInstance() {
        return commonObject; }

    public HBox getMainBox() {
        return mainBox; }

    public void setMainBox(HBox mainBox) {
        this.mainBox = mainBox; }
}
