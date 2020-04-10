package com.company;

import java.util.Scanner;

public class MenuUtil {

    public void displayMenu() {

        System.out.println("#########################################");
        System.out.println("1:\t check for palindrome");
        System.out.println("2:\t quit");
        System.out.println("anything other than '1' defaults to quit");
        System.out.println("#########################################");
        System.out.print("awaiting input: ");

    }

    public String readWord() {
        System.out.print("\nEnter your word: ");
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }

    public void printResult(String word, boolean isPalindrome) {

        System.out.print("The word '" + word + "' is ");

        if (isPalindrome) {
            System.out.print("a palindrome\n\n");
        } else {
            System.out.print("not a palindrome\n\n");
        }


    }


}
