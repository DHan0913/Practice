package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("태어난 년도를 입력하세요");
        System.out.print("년도:");
        int year = scanner.nextInt();
        System.out.println("올해:");
        System.out.println("태어난해:" + year);
        System.out.println("올해:" + "2023");

        int year2 = 2023;
        int age = year2 - year;
        System.out.println(age);
        System.out.println("=================");
        
        boolean freeHealthCheck = age >= 20;
        
        boolean freeCancerCheck = age >= 40;

        boolean isCheckTarget = false;
        if (year % 2 == year2 % 2) {
            isCheckTarget = true;
        }

        System.out.println(age + "세 이상");
        if (freeHealthCheck) {
            System.out.println("건강검진해");
            if (freeCancerCheck) {
                System.out.println("암검사");
            }
        } else {
            System.out.println("20살미만");
        }

        if (isCheckTarget) {
            System.out.println("건강검진해");
        } else {
            System.out.println("건강검진해 아님");
        }

        scanner.close();
    }


}
