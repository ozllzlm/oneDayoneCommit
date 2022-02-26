package yelim;

import java.util.Scanner;

public class operator {
	
	// for문으로 1~100까지 더하기
	public void for1_100() {
		int sum = 0;
		for(int i = 0; i < 101;i++) {
			sum += i;				
		}
		System.out.println(sum);	
	}
	
	// for문으로 1~100의 홀수만 더하기
	public void for1_100_2() {
		int sum = 1;
		int i = 1;
		while(i < 99) {
			i += 2;
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	// 99단 출력하기
	public void dan(){

		for(int i = 2; i < 10; i++) {
			System.out.println(i + "단을 출력합니다.");
			for(int j = 1; j < 10;j++) {
				System.out.println( i + "X" + j + "=" + i*j);
			}
		}
	}
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1이상의 숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num < 1) {
				System.out.println("잘못 입력하셨습니다.");			
			} else {
				for(int i = 1; i <= num; i++) {
					System.out.println(i);
				}
			}
		}
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1이상의 수를 입력하세요");
			int num = sc.nextInt();
			
			if(num < 0) {
				System.out.println("잘목 입력하셨습니다.");
			} else {
				for( int i = num; i >= 1; i--) {
					System.out.println(i);
				}
			}
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 하나 입력하세요");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
	while(true) {	
		System.out.println("정수1입력");
		int num1 = sc.nextInt();
		System.out.println("정수2입력");
		int num2 = sc.nextInt();
			
		if(num1 < 1 || num2 < 1) {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		} else {
			int min = 0;
			int max = 0;
			
			if(num1 < num2) {
				min = num1;
				max = num2;
			} else {
				min = num1;
				max = num2;
			}
			
			for(int i = min; i <= max; i++) {
				System.out.println(i);
			} break;
		} 	
	}
	}
	
	
	
	
}













