package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class SubstringReverse implements Item {
    @Override
    public String work() {
        String origin = Reader.readLine(Strings.MAIN_QUESTION);
        String substring = Reader.readLine("Enter the substring:");
        return ReverseStringUtil.reverse(origin,substring);
    }

    @Override
    public String getDescription() {
        return Strings.ITEM_SUB_DESCRIPTION;
    }

    @Override
    public String getExample() {
        return Strings.ITEM_SUB_EXAMPLE;
    }
}
