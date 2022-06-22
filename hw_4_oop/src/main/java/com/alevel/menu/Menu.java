package com.alevel.menu;

import com.alevel.menu.items.*;
import com.alevel.storage.Strings;
import com.alevel.utils.Reader;
import com.alevel.utils.UIUtil;

public class Menu {
    private static Menu instance;

    private Item[] menuItems = new Item[]{
        new Exit()
    };

    public void init(){
        if(instance == null) {
            instance = new Menu();
            Reader.init();
        }
    }

    public void show(){
        System.out.println(Strings.MAIN_MENU_TITLE);
        if(menuItems != null)
        for(int i=0; i<menuItems.length;i++){
            String description = Strings.TAB + menuItems[i].getDescription()+i;
            UIUtil.showMessageln(description);
        }
    }

    public void checkItem(){
            int indexOfMenuItem = Reader.readInt("",0,menuItems.length);
            UIUtil.showResult(menuItems[indexOfMenuItem].work());
    }
}
