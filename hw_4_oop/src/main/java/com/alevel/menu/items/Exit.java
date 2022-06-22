package com.alevel.menu.items;

import com.alevel.menu.Item;
import com.alevel.storage.Strings;
import com.alevel.utils.UIUtil;

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
}
