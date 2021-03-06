package com.alevel.Demo.MainMenu.items;

import com.alevel.Demo.Utils.UIUtil;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class Exit implements Item {
    @Override
    public String work() {
        UIUtil.showByeMessage();
        System.exit(0);
        return "";
    }

    @Override
    public String getDescription() {
        return Strings.ITEM_EXIT_DESCRIPTION;
    }

    @Override
    public String getExample() {
        return "";
    }
}
