package com.example.test;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args)
    {
        String password = passwordInput();
        passwordChecker(password);
    }
    public static String passwordInput()
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter password:");
        return reader.nextLine();
    }
    static boolean containsNum(String password) {
        boolean containsNumber = false;
        for (int checkNumber = 0; checkNumber < 10; checkNumber++)
        {
            if (password.contains("" + checkNumber)) {
                containsNumber = true;
            }
        }
        return containsNumber;
    }
    public static void passwordChecker(String password)
    {
        String errorMsg = "";
        String successMsg = "Your password is " + password;
        if (password.equals(password.toUpperCase()))
        {
            errorMsg = "Must contain lower case letter.";
        }
        if (password.equals(password.toLowerCase()))
        {
            errorMsg = "Must contain upper case letter.";
        }

        if (!containsNum(password))
        {
            errorMsg = "Must contain number 0-9.";
        }
        if (password.length() < 8)
        {
            errorMsg = "Must be at least 8 characters long.";
        }
        System.out.println(errorMsg != "" ? errorMsg : successMsg);
    }
}