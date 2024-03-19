package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요:");
		System.out.print("금익:");
		double a = scanner.nextInt();
		double tax;
		
		if (0 <= a && a <= 1000) {
			tax = a*0.09;
			System.out.println("소득세는 " + tax +"입니다");
		} else if (a > 1000 && a <= 4000) {
			tax = (1000*0.09) +0.18*(a-1000);
			System.out.println("소득세는" + tax +"입니다");
		} else if (a > 4000 && a <= 8000) {
			tax = (1000*0.09) +(0.18*3000)+0.27*(a-4000);
			System.out.println("소득세는" + tax +"입니다");
		} else if (a >= 8000) {
			tax = (1000*0.09) +(0.18*3000)+(4000*0.27)+0.36*(a-8000);
			System.out.println("소득세는" + tax +"입니다");
		} else {
			System.out.println("잘못 입력했습니다.");
	}
		scanner.close();
	}
}
