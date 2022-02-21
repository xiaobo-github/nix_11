package com.alevel.base.Core;

public class Animator {

    String animatedString;

    public Animator(String animateString){
        this.animatedString = animateString;
    }

    public void setAnimatedString(String animatedString) {
        this.animatedString = animatedString;
    }

    public void run(){
        for (char character: animatedString.toCharArray()) {
                UI.showChar(character);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                UI.showException(e.getMessage());
            }
        }
    }
}
