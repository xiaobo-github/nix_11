package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class BeginEndIndexReverse extends Item {
    public BeginEndIndexReverse(){
        this.description = Strings.ITEM_BEI_DESCRIPTION;
        this.example = Strings.ITEM_BEI_EXAMPLE;
    }

    @Override
    public String work() {
        String origin = Reader.readLine(Strings.MAIN_QUESTION);
        int maxIndex = (origin.length()-1);
        int beginIndex = Reader.readInt(Strings.BEGIN_INDEX_QUESTION+0+Strings.TO+maxIndex+Strings.COLON_BRACKET,0,maxIndex);
        int endIndex = Reader.readInt(Strings.END_INDEX_QUESTION+(beginIndex+1)+Strings.TO+maxIndex+Strings.COLON_BRACKET,beginIndex,maxIndex);
        return ReverseStringUtil.reverse(origin,beginIndex,endIndex);
    }
}
