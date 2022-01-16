package com.hw;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main( String[] args ) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        CaseModelConstructorMenu caseModelConstructorMenu = new CaseModelConstructorMenu();
        System.out.println(gson.toJson(caseModelConstructorMenu.getCaseModel()));


    }

}
