package com.alevel.base.Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader{

    private static Reader instance;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init(){
        if (instance == null) instance = new Reader();
    }

    public static String readLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            UI.showException(e.getMessage());
            return "";
        }
    }

}
