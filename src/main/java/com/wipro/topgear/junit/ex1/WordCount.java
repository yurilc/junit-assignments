package com.wipro.topgear.junit.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    private static final Pattern WORD_PATTERN = Pattern.compile("\\S+");

    public int count(String str){
        int words = 0;
        Matcher matcher = WORD_PATTERN.matcher(str);
        while(matcher.find()){
            words++;
        }
        return words;
    }
}
