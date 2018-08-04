package day2;

import java.util.Scanner;

public class PibonacciSum {
	
	public static void main(String[] args) {
		int a = 1;	//첫번째 수열
		int b = 1;	//두번째 수열
		int c = 0;	//a+b
		
		int sum = 2;	//수열의 합
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 숫자까지 피보나치 수열의 합을 구함");
		n = sc.nextInt();
		
		for(int i=3; i<=n; i++) {
			c = a+b;
			sum = sum+c;
			
			a = b;
			b = c;
		}
		
		System.out.println("입력한 " + n + "번째 까지의 합 : " + sum);
		sc.close();
		
		
	}

}
