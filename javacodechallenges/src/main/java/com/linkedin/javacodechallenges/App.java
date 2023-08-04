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
        
        if(password.length() < 6) {
            return false;
        }

        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;

        for(int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);
            if(!hasLowerCase && Character.isLowerCase(current)) {
                hasLowerCase = true;
            }
            else if(!hasUpperCase && Character.isUpperCase(current)) {
                hasUpperCase = true;
            }
            else if(!hasNumber && Character.isDigit(current)) {
                hasNumber = true;
            }

            // Kills for-loop if all conditions are met
            if(hasLowerCase && hasUpperCase && hasNumber) {
                break;
            }
        }
        
        return hasLowerCase && hasUpperCase && hasNumber;
    }
}
