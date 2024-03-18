package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.println("알파벳 1글자(소문자)를 입력하세요: ");
	        System.out.print("알파벳:");
	        char alpha = scanner.next().charAt(0);

	        if (alpha >= 'a' && alpha <= 'z') {
	            if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
	                System.out.println("모음입니다.");
	            } else {
	                System.out.println("자음입니다.");
	            
	       

	        scanner.close();
	    }
	            
	   }
	}
}
