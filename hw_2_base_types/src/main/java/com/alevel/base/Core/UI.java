package com.alevel.base.Core;

import static com.alevel.base.Storage.StringStorage.*;

public final class UI {
    private UI(){}

    public static void showMainMenu(){
        showMessageln("");
        showMessageln(MAIN_LEGEND_MESSAGE);
        for (String i: MAIN_MENU_MESSAGE) {
            showMessage("\t");
            showMessageln(i);
        }
        showMessage(CURSOR);
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

    public static void showByeMessage(int id){
        Animator animator = new Animator(MAIN_QUESTIONS_MESSAGE[id]);
        animator.run();
    }

    public static void showMainMenuQuestion(int id){
        showMessageln(MAIN_QUESTIONS_MESSAGE[id]);
    }

    public static void showMessageln(Object message){
        showMessage(message);
        System.out.println();
    }

    public static void showMessage(Object message){
        System.out.print(message);
    }

    public static void showAnswerMessage(Object answer){
        showMessageln(ANSWER_MESSAGE);
        showMessageln(answer);
    }


}