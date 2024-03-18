package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		int num; 
		int num2;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("첫번째 숫자1: ");
		num = sc.nextInt();
		System.out.print("두번째 숫자2: ");
		num2 = sc.nextInt();
		
		
		if (num >= num2) { 
			System.out.println("몫:" + num / num2);
			System.out.println("나머지:" + num % num2);
		} else if (num < num2) {
			System.out.println("몫:" + num2 / num);
			System.out.println("나머지:" + num2 % num);
		} else  {
			System.out.println("오류");
		}
		
		sc.close();

	}
	
}
