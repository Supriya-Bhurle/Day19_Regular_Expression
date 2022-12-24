package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[^@#$%^&*+=]*[@#$%^&*+=][^@#$%^&*+=]*$).{8,}$");
    public static void main(String[] args)
    {
        Matcher matcher = pattern.matcher("Supriyabhurle28@");
        if(matcher.matches())
            System.out.println(true);
        else
            System.out.println(false);
    }
}
