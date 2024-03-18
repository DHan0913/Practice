package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("사번을 입력하세요: ");
	        int a = scanner.nextInt();

	        if (a >= 0) {
	            int b = a % 3;
	            String team;

	            switch (b) {
	                case 0:
	                    team = "A팀";
	                    break;
	                case 1:
	                    team = "B팀";
	                    break;
	                case 2:
	                    team = "C팀";
	                    break;
	                default:
	                    team = "잘못 입력하셨습니다";
	                    break;
	            }

	            System.out.println("입력한 사번 " + a + "은(는) " + team + "입니다.");
	        } else {
	            System.out.println("잘못 입력하셨습니다.");
	        }

	        scanner.close();
	    }

	}


