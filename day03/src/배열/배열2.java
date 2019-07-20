package 배열;

public class 배열2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(num[0]);
		System.out.println(num[3]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num + ":" +num[i]);
		}
		
		double[] eye = {1.5,0.5,0.6,2.0,1.7};
		System.out.println(eye[2]);
		//배열은 위치값을 가지고 접근한다.
		//위치값은 index라고 부른다.
		//index는 0부터 시작한다.
		//index의 마지막 값은 개수-1 이다.
		System.out.println(eye.length);
		
		
		String[] name = {"민구", "지혜", "수정", "민수", "지아"};
		System.out.println(name[0]);
		System.out.println(name[name.length-1]);
		System.out.println(name.length + "명");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name + ":" + name[i]);
		}
		
		char[] gender = {'F', 'M'};
		System.out.println(gender[0]);
		
		for (int i = 0; i < gender.length; i++) {
			System.out.println(i + ":" + gender[i]);
		}
		
		
	}

}
