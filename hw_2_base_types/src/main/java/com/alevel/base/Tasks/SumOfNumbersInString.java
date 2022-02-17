package com.alevel.base.Tasks;

public final class SumOfNumbersInString {
    private SumOfNumbersInString(){}

    public static int calculate(String string){
        string = string.replaceAll("\\D","");
        if(string.length() < 1) return 0;
        int res = 0;
        for (char character: string.toCharArray()) {
            res += Character.getNumericValue(character);
        }
        return res;
    }
}
