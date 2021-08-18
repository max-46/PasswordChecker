package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordChecker {

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

    private void printStrength(int strength) {
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
        }
        System.out.println(output);
    }

    public void getPasswords() {
        int strength = 0;
        String password = userInput();
        if (!password.equals(password.toUpperCase())) {
            strength++;
        }
        if (!password.equals(password.toLowerCase())) {
            strength++;
        }
        if (containsNum(password)) {
            strength++;
        }
        if (password.length() >= 8) {
            strength++;
        }
        System.out.println("Your password is " + password);
        printStrength(strength);
    }
}
