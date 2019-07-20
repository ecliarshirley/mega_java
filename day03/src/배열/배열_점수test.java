package 배열;

public class 배열_점수test {

	public static void main(String[] args) {
		int score[] = new int[5];
		
		score[0]= 100;
		score[1]= 40;
		score[2]= 65;
		score[3]= 74;
		score[4]= 58;
		
		score[2]= 0;
		
		System.out.println("점수출력:");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	
	}

}
