package com.alevel.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    private static Reader instance;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init(){
        if (instance == null) instance = new Reader();
    }

    public static String readLine(){
        try {
            return reader.readLine();
        } catch (IOException e) {
            UIUtil.showException(e.getMessage());
            return "";
        }
    }

    public static String readLine(String message){
        UIUtil.showMessage(message);
        return readLine();
    }

    public static int parseBoundsInt(String src, int min, int max) throws IndexOutOfBoundsException{
        int parsedInt = Integer.parseInt(src);
        if(parsedInt >= min && parsedInt < max)
            return parsedInt;
        else throw new IndexOutOfBoundsException();
    }

    public static int readInt(String message, int min, int max){
        UIUtil.showMessage(message);
        boolean doThis = false;
        do{
            doThis = false;
            try {
                return Reader.parseBoundsInt(Reader.readLine(),min,max);
            }catch (Exception e) {
                UIUtil.showInputErrorMessage();
                UIUtil.showMessage(message);
                doThis = true;
            }
        }while (doThis == true);
        return 0;
    }
}
