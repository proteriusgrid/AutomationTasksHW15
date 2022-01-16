package com.hw;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;


public class CaseMenu   {

    @SerializedName("menu")
    @Expose
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }



}