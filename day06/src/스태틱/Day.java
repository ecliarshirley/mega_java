package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	//변수값들 저장
	public Day(String doing, int time, String location) {
		sum = sum + time;
		count++;
		System.out.println(count);
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	//변수값들 출력
	public String toString() {
		return doing + ", " + time + ", " + location;
	}
	
}
