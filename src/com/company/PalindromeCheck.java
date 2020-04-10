package com.company;

public class PalindromeCheck {

    private String word;

    public PalindromeCheck(String word) {
        this.word = word;
    }

    public boolean wordIsPalindrome() {

        for (int i = 0; i <= word.length() / 2; i++) {
            if (!charsAreEqual(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean charsAreEqual(int index) {
        return word.charAt(index) == word.charAt(word.length() - 1 - index);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}
