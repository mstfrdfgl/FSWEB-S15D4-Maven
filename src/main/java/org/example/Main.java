package org.example;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar "));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

    }

    public static boolean checkForPalindrome(String string){
        String text = string.replaceAll("[?.,!_\\- ]","").toLowerCase(Locale.ROOT);
        StringBuilder mahmut = new StringBuilder(text).reverse();
        return text.equals(mahmut.toString());
    }

    public static String convertDecimalToBinary(int number){
        String binary = "";
        while(number > 0){
            binary += String.valueOf(number % 2);
            number = number / 2;
        }
        StringBuilder newBinary = new StringBuilder(binary);
        return newBinary.reverse().toString();
    }

}
