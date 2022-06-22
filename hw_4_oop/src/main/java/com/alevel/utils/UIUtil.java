package com.alevel.utils;

import static com.alevel.storage.Strings.*;

public class UIUtil {
    public static void showMessage(Object message){
        System.out.print(message);
    }
    public static void showMessageln(Object message){
        showMessage(message);
        showMessage(LF);
    }
    public static void showException(String exMessage){
        showMessageln(exMessage);
    }
    public static void showInputErrorMessage(){
        showMessageln(INPUT_ERROR_MESSAGE);
    }
    public static void showByeMessage(){
        showMessageln(BYE_MESSAGE+LF);
    }
    public static void showResult(Object result){
        showMessageln(result+LF);
    }
}
