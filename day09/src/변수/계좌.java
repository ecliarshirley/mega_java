package 변수;

public class 계좌 {
	//전역변수(global 변수)
	//전역변수는 자동으로 초기화 된다.
	String accountName; //계좌명
	String name;		//사람이름
	int money;			//초기입금액 = 0;
	
	
	//생성자: 객체 생성시 자동 호출 메서드 //Source tab -> Constructor using Fields
	public 계좌(String accountName, String name, int money) {
		this.accountName = accountName;
		this.name = name;
		this.money = money;
//		int num; //쓰레기 값 상태
//		System.out.println(this.money); //전역변수
//		System.out.println(num);		//지역변수. 쓰레기 값 상태라 에러가 뜬다.
	}


	@Override
	public String toString() {
		return "계좌 [accountName=" + accountName + ", name=" + name + ", money=" + money + "]";
	}
	
	
	
}
