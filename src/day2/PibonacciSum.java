package day2;

import java.util.Scanner;

public class PibonacciSum {
	
	public static void main(String[] args) {
		int a = 1;	//ù��° ����
		int b = 1;	//�ι�° ����
		int c = 0;	//a+b
		
		int sum = 2;	//������ ��
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ���ڱ��� �Ǻ���ġ ������ ���� ����");
		n = sc.nextInt();
		
		for(int i=3; i<=n; i++) {
			c = a+b;
			sum = sum+c;
			
			a = b;
			b = c;
		}
		
		System.out.println("�Է��� " + n + "��° ������ �� : " + sum);
		sc.close();
		
		
	}

}
