package com.alevel.base.Core;

public final class Program {

    private Program(){}

    public static void run(){
        Reader.init();
        while (true) {
            UI.showMainMenu();
            Questions.mainMenuQuestion(Reader.readLine());
        }
    }
}
