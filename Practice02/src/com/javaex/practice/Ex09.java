package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
	int born; 
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		born = sc.nextInt();
		int year = 2023;
		int a = year - born;
		
		if (a <= 15 || a >= 65   ) { 
			System.out.print(a + " 살 무료예방접종 대상자입니다");
		} else {
			System.out.println(a + "살 무료예방접종 대상자가 아닙니다");
		}
		
		sc.close();
	}

}


