package com.alevel.base.Tasks;

public final class SumOfNumbersInString {
    private SumOfNumbersInString(){}

    public static String calculate(String string){
        string = string.replaceAll("\\D","");
        if(string.length() < 1) return "";
        int calc = 0;
        for (char character: string.toCharArray()) {
            calc += Character.getNumericValue(character);
        }
        return ""+calc;
    }
}
