package com.example.knk;

import javafx.scene.layout.HBox;

public class CommonObject {
    private static CommonObject commonObject = new CommonObject();

    private HBox mainBox;

    private CommonObject(){}
    public static CommonObject getInstance() {return commonObject; }

    public HBox getMainBox() {return mainBox; }

    public void setMainBox(HBox mainBox) {this.mainBox = mainBox; }
}
