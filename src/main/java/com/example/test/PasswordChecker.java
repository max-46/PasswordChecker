package com.example.test;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        var t = new PasswordChecker();
        String res = t.check();
        System.out.println(res);
    }

    private String passwordInput() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter password:");
        return reader.nextLine();
    }

    private boolean containsNum(String password) {
        boolean containsNumber = false;
        for (int checkNumber = 0; checkNumber < 10; checkNumber++) {
            if (password.contains("" + checkNumber)) {
                containsNumber = true;
            }
        }
        return containsNumber;
    }

    public String check() {
        String password = passwordInput();
        String errorMsg = "";
        String successMsg = "Your password is " + password;
        if (password.equals(password.toUpperCase())) {
            errorMsg = "Must contain a lower case letter.";
        } else if (password.equals(password.toLowerCase())) {
            errorMsg = "Must contain an upper case letter.";
        } else if (!containsNum(password)) {
            errorMsg = "Must contain a number.";
        } else if (password.length() < 8) {
            errorMsg = "Must be at least 8 characters long.";
        }
        return errorMsg.equals("") ? successMsg : errorMsg;
    }
}