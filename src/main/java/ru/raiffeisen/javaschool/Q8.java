package ru.raiffeisen.javaschool;

public class Q8 {

    public static void main(String[] args) {
        String s = Q8.class.getName();
        System.out.println(s);
        s = s.replaceAll(".", "/") + ".class";
        System.out.println(s);
    }
}
