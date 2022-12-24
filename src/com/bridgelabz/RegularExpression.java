package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static Pattern pattern = Pattern.compile("^([a-zA-Z0-9.]+)@([a-zA-Z0-9.]+).([a-zA-Z]{2,5})$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("abc.xyz@bl.co.in");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
