package com.alevel.Demo.MainMenu.items;

import com.alevel.ReverseStringUtil;
import com.alevel.Demo.Utils.Reader;
import com.alevel.Demo.MainMenu.Item;
import com.alevel.Demo.Storage.Strings;

public class BeginIndexReverse extends Item {
        public BeginIndexReverse(){
            this.description = Strings.ITEM_BI_DESCRIPTION;
            this.example = Strings.ITEM_BI_EXAMPLE;
        }

        @Override
        public String work() {
            String origin = Reader.readLine(Strings.MAIN_QUESTION);
            int maxIndex = (origin.length()-1);
            int beginIndex = Reader.readInt(Strings.BEGIN_INDEX_QUESTION+0+Strings.TO+maxIndex+Strings.COLON_BRACKET,0,maxIndex);
            System.out.println(beginIndex);
            return ReverseStringUtil.reverse(origin,beginIndex);
        }
    }
