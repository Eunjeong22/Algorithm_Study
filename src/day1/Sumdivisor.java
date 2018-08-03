package day1;

import java.util.*;

public class Sumdivisor {
//	https://www.acmicpc.net/problem/9506
//	1. 입력받기(유효성 검사)
//	2. 약수 구하기(리스트에 저장)
//	3. 약수의 합 구하기(입력받은 수와 비교)
//	4. 완전수인지 아닌지 판별
//	5. 출력
	
	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		List<String> list = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
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
			System.out.println("완전수가 아닙니다.");
		}
		
	}
}
