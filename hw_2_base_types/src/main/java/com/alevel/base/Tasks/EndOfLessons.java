package com.alevel.base.Tasks;

public final class EndOfLessons {
    private EndOfLessons(){}

    public static String calculate(String inNumberOfLesson) {
        inNumberOfLesson = inNumberOfLesson.replaceAll("\\D","");
        if(inNumberOfLesson.length()<1) return "";
        int numberOfLesson = Integer.valueOf(inNumberOfLesson);
        int lastLesson = 10;
        if(numberOfLesson<1|numberOfLesson>lastLesson){
            return "";
        }

        int firstLessonStartTime = 32400;
        int lessonLengthTime = 2700;
        int oddBreakTime = 300;
        int evenBreakTime = 900;
        int differenceBreakTime = evenBreakTime - oddBreakTime;
        int allOddBreaksTime = (numberOfLesson-1)*oddBreakTime;
        int allEvenBreaksTime = (numberOfLesson-1)/2*differenceBreakTime;
        int allLessonsTime = lessonLengthTime*numberOfLesson;
        int answerTime = firstLessonStartTime+allLessonsTime+allOddBreaksTime+allEvenBreaksTime;

        return ""+(answerTime/3600)+":"+(answerTime%3600)/60;
    }
}
