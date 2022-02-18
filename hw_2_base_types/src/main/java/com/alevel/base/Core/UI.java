package com.alevel.base.Core;

import static com.alevel.base.Storage.StringStorage.*;

public final class UI {
    private UI(){}

    public static void showMainMenu(){
        showMenu(MAIN_MENU_MESSAGE,MAIN_LEGEND_MESSAGE,CURSOR);
    }

    public static void showChar(char character){
        showMessage(character);
    }

    public static void showException(String e){
        showMessageln(e);
    }

    public static void showInputErrorMessage(){
        showMessageln(INPUT_ERROR_MESSAGE);
    }

    public static void showByeMessage(){
        showAnimateMessage(GENERAL_QUESTIONS_MESSAGE[0]);
    }

    public static void showMainMenuQuestion(int id){
        showMessageln("");
        showMessage(MAIN_MENU_MESSAGE[id]);
        showMessageln(PRE_QUESTION_MESSAGE);
        showMessageln(GENERAL_QUESTIONS_MESSAGE[id]);
        showMessage(CURSOR);
    }

    public static void showMessageln(Object message){
        showMessage(message);
        showMessage("\n");
    }

    public static void showAnswerMessage(Object answer){
        showMessageln(ANSWER_MESSAGE);
        showMessageln(answer);
    }

    public static void showMenu(String[] myMenu, String legend, String cursor){
        showMessageln("");
        showMessageln(legend);
        for (int i = 1; i < myMenu.length; i++) {
            showMessage("\t");
            showMessageln(""+i+" - "+myMenu[i]);
        }
        showMessage("\t");
        showMessageln(myMenu[0]);
        showMessage(cursor);
    }

    public static void showAnimateMessage(String message){
        Animator animator = new Animator(message);
        animator.run();
    }

    public static void showMessage(Object message){
        System.out.print(message);
    }
}