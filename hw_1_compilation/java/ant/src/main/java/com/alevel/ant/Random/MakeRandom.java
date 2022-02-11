package com.alevel.ant.Random;

import org.apache.commons.text.*;

public class MakeRandom{
        public static void make(int stringSize){
            RandomStringGenerator generator = new RandomStringGenerator.Builder()
                    .withinRange('a', 'z').build();
            String randomLetters = generator.generate(stringSize);
            System.out.println("Random string example(commons-text library):");
            System.out.println(randomLetters+"\n");
        }
}