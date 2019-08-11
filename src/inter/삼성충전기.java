package inter;

public class 삼성충전기 implements 충전기 { //구현하다 해서 implements사용

	@Override
	public void 네모로만들어야함() {
		System.out.println("입체 네모로 만들다");
	}

	@Override
	public void 분리되어야함() {
		System.out.println("이중으로 분리되게 만들다");
	}

	@Override
	public void 플러그꼽는다() {
		System.out.println("플러그 꼽자");
	}
	
}
