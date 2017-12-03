package com.apiit.flyweight;

import java.util.Scanner;

public class flyweightRealWorld {
    public static void main(String[] args) {
        String s1="test";
        String s2="test";
        Scanner in = new Scanner(System.in);
        String s3=in.nextLine();
        System.out.println(s3==s2);
    }
}
