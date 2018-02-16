 package com.prasanna;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class DuplicateWordSearcher {
   // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
 
        String text = "india is one of the famous country in the world and is powerfull country too";
 
        List<String> list = Arrays.asList(text.split(" "));
 
        Set<String> s = new HashSet<String>(list);
        for (String word : s) {
            System.out.println(word + ": " + Collections.frequency(list, word));
        }
    }
}