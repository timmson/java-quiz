package ru.raiffeisen.javaschool;

public class Q9 {

    public static void main(String[] args) {
        // \u0022 is the Unicode escape for double quote (")
        int i = "a\u0022.length() + \u0022b".length();
        System.out.println(i);

    }

}



