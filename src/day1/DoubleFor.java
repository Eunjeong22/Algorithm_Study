package day1;

public class DoubleFor {
	public static void main(String[] args) {
//		*문자열 거꾸로 출력
		String str = "hello java!!!";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
//		*구구단 출력
		for(int dan=2;dan<10;dan++) {
			for(int x=1;x<10;x++){
				System.out.print(dan + " * " + x + " = " + dan*x + "\t");
			}
			System.out.println();
		}
		
//		*별트리
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("*"); 
			}
			System.out.println("");
		}
		
//		*별트리 2
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
