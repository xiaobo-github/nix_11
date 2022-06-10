package com.alevel.Demo.MainMenu.items;

import com.alevel.Demo.Utils.UIUtil;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class Exit extends Item {
    public Exit(){
        this.description = Strings.ITEM_EXIT_DESCRIPTION;
        this.example = "";
    }

    @Override
    public String work() {
        UIUtil.showByeMessage();
        System.exit(0);
        return "";
    }
}
