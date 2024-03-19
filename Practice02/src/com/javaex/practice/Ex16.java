package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요:");
		System.out.print("숫자:");
		double a = scanner.nextInt();
		double b;
		
		if (a <= 0 ) {
			b = a*a*a-(9*a)+2;
			System.out.println("계산결과는 " + b +"입니다");
		} else if (a > 0) {
			b = (7*a)+2;
			System.out.println("계산결과는" + b +"입니다");

	}

	}
}
