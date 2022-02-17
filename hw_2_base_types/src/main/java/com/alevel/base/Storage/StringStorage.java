package com.alevel.base.Storage;

public final class StringStorage {
    private StringStorage(){}

    public static final String CURSOR = ">";
    public static final String [] MAIN_MENU_MESSAGE = new String [] {
            "1 - Find the sum of all numbers in a string,",
            "2 - Counting and sorting characters(Cyrillic/Latin) in a string,",
            "0 - Exit from the program."
    };
    static final int LENGTH_MAIN_MENU_MESSAGE = MAIN_MENU_MESSAGE.length-1;
    public static final String MAIN_LEGEND_MESSAGE = "Please enter the number corresponding to the desired menu item in the range 0-"+ LENGTH_MAIN_MENU_MESSAGE +":";
    public static final String INPUT_ERROR_MESSAGE = "Invalid input, please make your choice and try again...";
    public static final String [] MAIN_QUESTIONS_MESSAGE = new String [] {
            "See ya later!",
            "Please enter your string:",
            "Please enter your string:"
    };
    public static final String ANSWER_MESSAGE = "The answer is: ";
}
