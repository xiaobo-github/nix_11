package com.alevel.base.Core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

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
