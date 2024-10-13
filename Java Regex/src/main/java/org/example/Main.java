package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static class MyRegex{
        private String regex = "^(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\\\.){3}(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5]))$";
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        MyRegex myregex = new MyRegex();

        Pattern pattern = Pattern.compile(myregex.regex);
        while(sc.hasNext()) {
            String s = sc.next();
            if (pattern.matcher(s).matches())
                System.out.println("true");
            else System.out.println("false");
        }

    }
}