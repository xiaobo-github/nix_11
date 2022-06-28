package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class BeginIndexReverse implements Item {
        @Override
        public String work() {
            String origin = Reader.readLine(Strings.MAIN_QUESTION);
            int maxIndex = (origin.length()-1);
            int beginIndex = Reader.readInt(String.format(Strings.BEGIN_INDEX_QUESTION_F,0,maxIndex),0,maxIndex);
            System.out.println(beginIndex);
            return ReverseStringUtil.reverse(origin,beginIndex);
        }

    @Override
    public String getDescription() {
        return Strings.ITEM_BI_DESCRIPTION;
    }

    @Override
    public String getExample() {
        return Strings.ITEM_BI_EXAMPLE;
    }
}
