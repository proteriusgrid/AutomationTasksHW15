package com.hw;

import java.util.ArrayList;
import java.util.List;

public class CaseModelConstructorMenu {

    public CaseMenu getCaseModel() {

        Menu menu = new Menu();
        menu.setId("file");
        menu.setValue("File");

        Popup popup = new Popup();
        menu.setPopup(popup);

        List<MenuItem> menuItemList = new ArrayList<>();

        MenuItem menuItem1 = new MenuItem();
        menuItem1.setValue("New");
        menuItem1.setOnclick("CreateNewDoc()");
        menuItemList.add(menuItem1);
        popup.setMenuItem(menuItemList);

        MenuItem menuItem2 = new MenuItem();
        menuItem2.setValue("Open");
        menuItem2.setOnclick("OpenDoc()");
        menuItemList.add(menuItem2);
        popup.setMenuItem(menuItemList);

        MenuItem menuItem3 = new MenuItem();
        menuItem3.setValue("Close");
        menuItem3.setOnclick("CloseDoc()");
        menuItemList.add(menuItem3);
        popup.setMenuItem(menuItemList);

        CaseMenu caseMenu = new CaseMenu();
        caseMenu.setMenu(menu);

        return caseMenu;
    }
    }

