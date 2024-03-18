package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("알파벳 1글자(소문자)를 입력하세요"); 
        System.out.print("알파벳:");  
        char alpha = scanner.next().charAt(0);


        switch (alpha) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("입력한 알파벳은 모음입니다.");
                break;
            default:
                System.out.println("자음입니다.");
        }

        scanner.close();
	}

}
