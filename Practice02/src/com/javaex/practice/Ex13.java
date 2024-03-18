package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        int smallerNumber = (num1 < num2) ? num1 : num2;
        int largerNumber = (num1 > num2) ? num1 : num2;

        if (largerNumber % smallerNumber == 0) {
            System.out.println(smallerNumber + "는 " + largerNumber + "의 약수입니다.");
        } else {
            System.out.println(smallerNumber + "는 " + largerNumber + "의 약수가 아닙니다.");
        }
        
        scanner.close();
    }

}
