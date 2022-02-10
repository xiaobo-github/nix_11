package com.alevel.console.Random;

import org.apache.commons.text.*;

public class MakeRandom{
        public static void make(String string){
            RandomStringGenerator generator = new RandomStringGenerator.Builder()
                    .withinRange('a', 'z').build();
            String randomLetters = generator.generate(20);
            System.out.println("Random string example(commons-text library):");
            System.out.println(randomLetters+"\n");
        }
}