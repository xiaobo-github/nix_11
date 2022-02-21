package com.alevel.base.Core;

import com.alevel.base.Tasks.*;

import java.util.function.UnaryOperator;

public final class Questions {

    private Questions(){}

    public static void mainMenuQuestion(String line) {
        switch (line) {
            case "1" -> {
                while (menuQuestion(Integer.valueOf(line),  SumOfNumbersInString::calculate)) {}
            }
            case "2" -> {
                while (menuQuestion(Integer.valueOf(line),  CountCharactersString::calculate)) {}
            }
            case "3" -> {
                while (menuQuestion(Integer.valueOf(line),  EndOfLessons::calculate)) {}
            }
            case "" -> {
                UI.showByeMessage();
                System.exit(0);
            }
            default -> {
                UI.showInputErrorMessage();
            }
        }
    }

    static boolean menuQuestion(int questionId, UnaryOperator<String> task){
        UI.showMainMenuQuestion(questionId);
        String answer = task.apply(Reader.readLine());
        if (answer.equals("")) return false;
        UI.showAnswerMessage(answer);
        return true;
    }
}
