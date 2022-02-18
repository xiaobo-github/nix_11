package com.alevel.base.Tasks;

public final class EndOfLessons {
    private EndOfLessons(){}

    public static String calculate(String inNumberOfLesson) {
        inNumberOfLesson = inNumberOfLesson.replaceAll("\\D","");
        if(inNumberOfLesson.length()<1) return "";
        int numberOfLesson = Integer.valueOf(inNumberOfLesson);
        int lastLesson = 10;
        if(numberOfLesson < 1 | numberOfLesson > lastLesson){
            return "..Hey,wait a minute.. This input is invalid! Lesson number must be from 1 to "+lastLesson+",\nbut your input is: "+numberOfLesson;
        }

        int secondInAMinute = 60;
        int secondsInAnHour = 60 * secondInAMinute;
        int firstLessonStartTime = 9 * secondsInAnHour;
        int lessonLengthTime = 45 * secondInAMinute;
        int oddBreakTime = 5 * secondInAMinute;
        int evenBreakTime = 15 * secondInAMinute;
        int differenceBreakTime = evenBreakTime - oddBreakTime;
        int allOddBreaksTime = (numberOfLesson-1) * oddBreakTime;
        int allEvenBreaksTime = (numberOfLesson-1)/2 * differenceBreakTime;
        int allLessonsTime = lessonLengthTime * numberOfLesson;
        int answerTime = firstLessonStartTime + allLessonsTime + allOddBreaksTime + allEvenBreaksTime;

        return "" + (answerTime/secondsInAnHour) + ":" + (answerTime % secondsInAnHour)/secondInAMinute;
    }
}
