package ���;

public class �ڵ������ {

	public static void main(String[] args) {
		System.out.println("����");
		���� s = new ����();
		s.color = "����";
		s.name = "���� ����";
		s.start();		//�ڵ���
		s.windowOpen();	//����
		
		System.out.println(s);  //toString ������ �� ������
		
		System.out.println("--------------------");
		System.out.println("Ʈ��");
		Ʈ�� t = new Ʈ��();
		t.color = "�Ķ�";
		t.name = "�����Ʈ��";
		t.move();
		System.out.println(t);
		
	}

}
