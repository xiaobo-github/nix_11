package com.alevel.base.Core;

import com.alevel.base.Tasks.*;

public final class Questions {
    private Questions(){}

    public static void mainMenuQuestion(String line) {
        switch (line) {
            case "1" -> {
                UI.showMainMenuQuestion(Integer.valueOf(line));
                UI.showAnswerMessage(SumOfNumbersInString.calculate(Reader.readLine()));
            }
            case "2" -> {
                UI.showMainMenuQuestion(Integer.valueOf(line));
                UI.showAnswerMessage(CountCharactersString.Count(Reader.readLine()));
            }
            case "0" -> {
                UI.showByeMessage(Integer.valueOf(line));
                System.exit(0);
            }
            default -> {
                UI.showInputErrorMessage();
            }
        }
    }
}
