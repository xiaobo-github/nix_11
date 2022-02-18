package com.alevel.base.Storage;

public final class StringStorage {
    private StringStorage(){}

    public static final String [] MAIN_MENU_MESSAGE = new String [] {
            "Enter an empty string to exit.",
            "Find the sum of all numbers in a string,",
            "Counting and sorting characters(Cyrillic/Latin) in a string,",
            "Calculate lesson end time,"
    };
    public static final String [] GENERAL_QUESTIONS_MESSAGE = new String [] {
            "See ya later!",
            "Please enter your string:",
            "Please enter your string:",
            "Please enter lesson number(1-10):"
    };
    public static final String CURSOR = ">";
    static final int LENGTH_MAIN_MENU_MESSAGE = MAIN_MENU_MESSAGE.length-1;
    public static final String MAIN_LEGEND_MESSAGE = "Please enter the number corresponding to the desired menu item in the range 1-"+ LENGTH_MAIN_MENU_MESSAGE +":";
    public  static final String PRE_QUESTION_MESSAGE = " enter an empty string to exit to the main menu.";
    public static final String INPUT_ERROR_MESSAGE = "Invalid input, please make your choice and try again...";
    public static final String ANSWER_MESSAGE = "The answer is: ";
}
