package com.company;

import com.company.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Circle.area(num);
        Circle.circumference(num);

    }
    }



