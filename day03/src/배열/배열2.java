package �迭;

public class �迭2 {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		System.out.println(num[0]);
		System.out.println(num[3]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num + ":" +num[i]);
		}
		
		double[] eye = {1.5,0.5,0.6,2.0,1.7};
		System.out.println(eye[2]);
		//�迭�� ��ġ���� ������ �����Ѵ�.
		//��ġ���� index��� �θ���.
		//index�� 0���� �����Ѵ�.
		//index�� ������ ���� ����-1 �̴�.
		System.out.println(eye.length);
		
		
		String[] name = {"�α�", "����", "����", "�μ�", "����"};
		System.out.println(name[0]);
		System.out.println(name[name.length-1]);
		System.out.println(name.length + "��");
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
