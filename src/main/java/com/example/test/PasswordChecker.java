package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordChecker {
    
    int strength;

    public PasswordChecker() {
        strength = 0;
    }
    
    

    public static void main(String[] args) {
        var pc = new PasswordChecker();
        pc.getPasswords();
    }

    private String userInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter password: ");
        return reader.nextLine();
    }

    private boolean containsNum(String password) {
        boolean containsNumber = false;
        for (int checkNumber = 0; checkNumber < 10; checkNumber++) {
            if (password.contains(String.valueOf(checkNumber))) {
                containsNumber = true;
            }
        }
        return containsNumber;
    }

    private void printStrength() {
        String output = "Strength = ";
        switch (strength) {
            case 0:
                output += "very weak";
                break;
            case 1:
                output += "weak";
                break;
            case 2:
                output += "average";
                break;
            case 3:
                output += "strong";
                break;
            case 4:
                output += "very strong";
                break;
        }
        System.out.println(output);
    }
    
    private boolean hasLowerCase(String str) {
        return !str.equals(str.toUpperCase());
    }
    
       private boolean hasUpperCase(String str) {
        return !str.equals(str.toLowerCase());
    }
       
    private boolean isLong(String str) {
        return str.length() >= 8;
    }

    public void getPasswords() {
        String password = userInput();
        if (hasUpperCase(password)) {
            strength++;
        }
        if (hasLowerCase(password)) {
            strength++;
        }
        if (containsNum(password)) {
            strength++;
        }
        if (isLong(password)) {
            strength++;
        }
        System.out.println("Your password is " + password);
        printStrength();
    }
}
