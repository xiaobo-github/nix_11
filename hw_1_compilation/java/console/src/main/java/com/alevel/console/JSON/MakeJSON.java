package com.alevel.console.JSON;

import org.apache.commons.text.*;

public class MakeJSON{
        public static void make(String string){
            RandomStringGenerator generator = new RandomStringGenerator.Builder()
                    .withinRange('a', 'z').build();
            String randomLetters = generator.generate(20);
            System.out.println("random string example(commons-text library):");
            System.out.println(randomLetters+"\n");
        }
}