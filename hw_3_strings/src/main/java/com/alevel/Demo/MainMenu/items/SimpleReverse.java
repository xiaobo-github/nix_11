package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class SimpleReverse extends Item {
    public SimpleReverse(){
        this.description = Strings.ITEM_SIMPLE_DESCRIPTION;
        this.example = Strings.ITEM_SIMPLE_EXAMPLE;
    }

    @Override
    public String work() {
        String origin = Reader.readLine(Strings.MAIN_QUESTION);
        return ReverseStringUtil.reverse(origin);
    }
}
