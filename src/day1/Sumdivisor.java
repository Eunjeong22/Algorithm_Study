package day1;

import java.util.*;

public class Sumdivisor {
//	https://www.acmicpc.net/problem/9506
//	1. �Է¹ޱ�(��ȿ�� �˻�)
//	2. ��� ���ϱ�(����Ʈ�� ����)
//	3. ����� �� ���ϱ�(�Է¹��� ���� ��)
//	4. ���������� �ƴ��� �Ǻ�
//	5. ���
	
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		List<String> list = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		num = scanner.nextInt();
		
		
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				list.add(Integer.toString(i));
				sum += i;
			}
		}
		
		if(sum == num) {
			int y = list.size();
			for(int x=0; x<y; x++) {
				if(x==y-1) {
					System.out.print(list.get(x));
				} else {
					System.out.print(list.get(x) + "+");
				}
			}
		} else {
			System.out.println("�������� �ƴմϴ�.");
		}
		
	}
}
