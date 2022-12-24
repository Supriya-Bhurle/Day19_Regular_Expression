package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static Pattern pattern = Pattern.compile("^(^([0-9]{2})\s([0-9]{10})$)");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("91 9919819801");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
