package com.vnr.nazish.vnrvjiet.java8_lambdas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.print("Average of list of numbers: ");
        AvgOfInt.average();
        System.out.print("The strings which begin with letter a and have exactly 3 letters are :");
        StringsWith4letters.findStrings();
        System.out.print("Palindromic Strings are :");
        PalindromeString.palindromes();
    }
}
