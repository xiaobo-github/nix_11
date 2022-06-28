package com.alevel;

import com.alevel.menu.Menu;

public class Program {

    public static void run() {
        Menu menu = new Menu();
        menu.init();
        while (true) {
            menu.show();
            menu.checkItem();
        }
    }
}
