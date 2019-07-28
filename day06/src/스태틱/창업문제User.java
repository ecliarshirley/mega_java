package 스태틱;

public class 창업문제User {

	public static void main(String[] args) {
		
		창업문제 work1 = new 창업문제("홍길동", 25, "남");
		창업문제 work2 = new 창업문제("김길동", 23, "여");
		
		
		System.out.println(work1);
		System.out.println(work2);
		
		System.out.println("직원들의 평균나이: " + 창업문제.avg);
		System.out.println("총 직원 수 : " + 창업문제.count);
		
	}

}
