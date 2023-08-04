package com.linkedin.javacodechallenges;

import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    // Challenge 1
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Challenge 2
    public static boolean isPasswordComplex(String password) {
        
        
        return password.length() >= 6 
        && password.matches(".*[A-Z].*")
        && password.matches(".*[a-z].*")
        && password.matches(".*\\D.*");
    }
}
