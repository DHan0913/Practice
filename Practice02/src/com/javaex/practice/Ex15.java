package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

        System.out.println("출력되는 내용을 입력하세요");
        System.out.print("기호:");
        char o = scanner.next().charAt(0);

        System.out.print("숫자1:");
        double num1 = scanner.nextDouble();

        System.out.print("숫자2:");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (o) {
            case '+':
                result = num1 + num2;
                System.out.println("결과: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("계산할 수 없습니다.");
                    break;
                } else {
                    result = num1 / num2;
                    System.out.println("결과: " + result);
                    break;
                }
            default:
                System.out.println("계산할 수 없는 기호입니다");
                break;
        }

      

        scanner.close();
    }
	

}
