package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("사번(정수)를 입력하세요");
	        System.out.print("사번:");
	        int employee = scanner.nextInt();

	        if (employee == 0) {
	            System.out.println("잘못된 사번입니다.");
	        } else {
	            int teamx = employee % 3;

	            String team;
	            switch (teamx) {
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
	                    team = "문의";
	                    break;
	            }

	            System.out.println(team + "입니다.");
	        }

	        scanner.close();
	    }

}
