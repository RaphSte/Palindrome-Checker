package com.company;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        MenuUtil menuUtil = new MenuUtil();

        while (true){
            menuUtil.displayMenu();
            //read answer
            Scanner s = new Scanner(System.in);

            if (s.nextLine().equals("1")){
                String word = menuUtil.readWord();
                boolean isPalindrome = new PalindromeCheck(word).wordIsPalindrome();
                menuUtil.printResult(word, isPalindrome);
            }else{
                break;
            }




        }


    }



}
