package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		int num; 
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("서로 다른 숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		
		
		if (num <= num2 && num <= num3) { 
			System.out.println("가장 작은수는" + num +"입니다");
		} else if (num2 <= num && num2 <= num3) {
			System.out.println("가장 작은수는" + num2 +"입니다");
		} else if (num3 <= num && num3 <= num2) {
			System.out.println("가장 작은수는" + num2 +"입니다");
		} else  {
			System.out.println("오류");
		}
		
		sc.close();

	}


}
