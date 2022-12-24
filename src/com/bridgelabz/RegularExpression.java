package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static Pattern pattern = Pattern.compile("^([A-z]?[a-z]{8,})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("Supriyabhurle");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
