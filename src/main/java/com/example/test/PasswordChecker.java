package com.example.test;

import java.util.Scanner;

public class PasswordChecker {

    public PasswordChecker() {
    }

    public static void main(String[] args) {
        var pc = new PasswordChecker();
        pc.getPassword();
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

    private void getPassword() {
        while (true) {
            String password = userInput();
            if (password.equals(password.toUpperCase())) {
                System.out.println("Must contain a lower case letter.");
            } else if (password.equals(password.toLowerCase())) {
                System.out.println("Must contain an upper case letter.");
            } else if (!containsNum(password)) {
                System.out.println("Must contain a number.");
            } else if (password.length() < 8) {
                System.out.println("Must be at least 8 characters long.");
            } else {
                System.out.println("Your password is " + password);
                break;
            }
        }
    }
}
