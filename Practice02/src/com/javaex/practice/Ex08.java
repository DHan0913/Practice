package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		double cm; 
		double kg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		cm= sc.nextInt();
		System.out.print("몸무게: ");
		kg= sc.nextInt();
		
		cm = ((cm / 100) * (cm/100));
		
		double bmi = kg / cm;
		
		if (bmi <= 24.9 && bmi >= 18.5) {
			System.out.println("정상체중입니다.");
		} else if (bmi > 24.9) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("저체중입니다.");
		}
			System.out.println("BMI" +bmi);
			
			sc.close();	
		}
		
}
