package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class SimpleReverse implements Item {
    @Override
    public String work() {
        String origin = Reader.readLine(Strings.MAIN_QUESTION);
        return ReverseStringUtil.reverse(origin);
    }

    @Override
    public String getDescription() {
        return Strings.ITEM_SIMPLE_DESCRIPTION;
    }

    @Override
    public String getExample() {
        return Strings.ITEM_SIMPLE_EXAMPLE;
    }
}
