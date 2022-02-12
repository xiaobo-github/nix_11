package com.alevel.maven.Reverse;

import org.apache.commons.lang3.*;

public class MakeReverse{
           public static void make(String string){
               System.out.println("Reverse string example(commons-lang3 library):");
               System.out.println(string);
               System.out.println("<-->");
               System.out.println(StringUtils.reverse(string)+"\n");
        }
}