package com.alevel.Demo.MainMenu;

import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.Utils.UIUtil;
import com.alevel.Demo.Storage.Strings;
import com.alevel.Demo.MainMenu.items.*;

public class Menu {
    private static Menu instance;
    private final int humanize = 1;

    private Item[] menuItems = new Item[]{
        new SimpleReverse(),
        new BeginIndexReverse(),
        new BeginEndIndexReverse(),
        new SubstringReverse(),
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
            String description = Strings.TAB + (humanize + i) + Strings.BRACKET + menuItems[i].getDescription();
            UIUtil.showMessagef(Strings.FORMAT_ITEM,description, menuItems[i].getExample());
        }
    }

    public void checkItem(){
            int indexOfMenuItem = Reader.readInt("",humanize,menuItems.length+humanize);
            UIUtil.showResult(menuItems[indexOfMenuItem - humanize].work());
    }
}
