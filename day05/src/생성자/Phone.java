package ������;

public class Phone {

	String color;
	int size;
	
	//��ü������ �ڵ�ȣ��
	//������ constructor
	//�Է°��� ���� ������: �⺻������ default.
	//�ڵ����� �������
	public Phone() {
		System.out.println("���� �ڵ� ȣ�� ��.");
	}
	
	// ����, 7
	public Phone(String c, int s) {
		color = c;
		size = s;				
	}
	
	@Override
	public String toString() {
		return color + ", " +size;
	}
	
}
