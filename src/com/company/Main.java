package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String str = "The family was very wealthy in Elon's youth;Errol Musk once said,\"We had so much money at times we couldn't even close our safe\".Test test-test";
        String[] str1 = str.split(" (?!.+\")|(?<!\".{2,}) |[;,.]");
        for (String value : str1) {
            System.out.println(value);
        }

    }
}
