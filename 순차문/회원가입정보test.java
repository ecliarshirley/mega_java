package 순차문;

import java.util.Scanner;

public class 회원가입정보test {

	public static void main(String[] args) {
		System.out.println("=====================");
		System.out.println("회원가입 정보");
		System.out.println("---------------------");
		
		Scanner test = new Scanner(System.in);
		System.out.print("이름: ");
		String name = test.next();
		System.out.print("아이디 :");
		String id = test.next();
		System.out.print("비번: ");
		String pw = test.next();
		System.out.print("연락처: ");
		String contact = test.next();
		
		System.out.println("---------------------");
		System.out.println(name +","+ id +","+ pw +","+ contact);
		
	}

}
