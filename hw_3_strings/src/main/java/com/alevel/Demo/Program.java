package com.alevel.Demo;

import com.alevel.Demo.MainMenu.Menu;

public class Program {
    public static void run(){
        Menu menu = new Menu();
        menu.init();
        while (true) {
            menu.show();
            menu.checkItem();
        }
    }
}
