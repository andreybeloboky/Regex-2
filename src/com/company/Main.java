package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("( [\".*\"] )");
        String[] str1 = pattern1.split("This \"huge test\" is pointless");
        for (String value : str1) {
            System.out.println(value);
        }
        Pattern pattern2 = Pattern.compile("[\s+]|-{2}");
        String[] str2 = pattern2.split("Suzie Smith-Hopper test--hyphens");
        for (String value : str2) {
            System.out.print(value + ",");
        }
        Pattern pattern3 = Pattern.compile("[\s+]|-{2}");
        String[] str3 = pattern3.split("I can't do it");
        for (String value : str3) {
            System.out.print(value + ",");
        }
        Pattern pattern4 = Pattern.compile("[\s;]+|-{2}");
        String[] str4 = pattern4.split("Too long; didn't read");
        for (String value : str4) {
            System.out.print(value + ",");
        }
    }
}
