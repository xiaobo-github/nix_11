package com.alevel.base.Tasks;

import java.util.Arrays;

public final class CountCharactersString {

    private CountCharactersString(){}

    public static String calculate(String string){
        string = string.replaceAll("[^a-zA-Zа-яА-Я]","");
        if(string.length()<1) return "";
        StringBuilder workString = new StringBuilder(string);
        StringBuilder originString = new StringBuilder();
        do{
            char originChar = workString.charAt(0);
            workString = new StringBuilder(workString.toString().replaceAll("[" + originChar + "]", ""));
            originString.append(originChar);
        }while (workString.length()>0);

        int length = originString.length();
        Symbol[] symbols = new Symbol[length];
        for (int i = 0; i < length; i++) {
            symbols[i] = new Symbol(originString.charAt(i));
            symbols[i].setCount(string.replaceAll("[^"+symbols[i].getCharacter()+"]","").length());
        }
        Arrays.sort(symbols);
        for (Symbol s: symbols) {
            workString.append(s.toString());
        }
        return workString.toString();
    }
}
