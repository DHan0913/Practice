package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);

		        System.out.println("태어난 년도를 입력하세요: ");
		        System.out.print("년도:");
		        int Year = scanner.nextInt();

		        int Year2 = 2023;
		        int age = Year2 - Year;

		        if (age < 15 || age >= 65) {
		            System.out.println(age + "살 무료예방접종 대상자 입니다.");
		        } else {
		            System.out.println(age + "살 무료예방접종 대상자가 아닙니다.");
		        }

		        scanner.close();
		    
			}

		
}

	


