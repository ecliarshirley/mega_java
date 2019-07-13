package 연산자;

import java.util.Date;

public class 집에갈시간 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재시간" +hour);
		
				
		
		//비교연산자의 결과는 true/false boolean
		if(hour < 16) {   // true
			System.out.println("집에갈 시간이 좀 남아 있군요");
			
		} else { //false
			System.out.println("집에 갈 시간이 거의 다 되었군요");
		}
		
		
		
	}

}
