package 스래드;

public class 증가감소 {

	public static void main(String[] args) {
		증가 i = new 증가();
		감소 d = new 감소();
		
		i.start();
		d.start();
	}

}
