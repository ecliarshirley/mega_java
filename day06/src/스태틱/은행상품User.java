package ����ƽ;

public class �����ǰUser {

	public static void main(String[] args) {

		�����ǰ user1 = new �����ǰ("û������", "��ƹ���", 500);
		�����ǰ user2 = new �����ǰ("������", "��ƹ�����", 30);
		�����ǰ user3 = new �����ǰ("��������", "�ھƹ���", 100);
		
		System.out.println("----------------------------------------------");
		System.out.println(user2.product +" ���忡�� " + user2.money +"������ ����־��");
		System.out.println(user3.name +" ���忡�� " + user3.money +"������ ����־��");
		
		int sum = user1.money + user2.money + user3.money;
		
		System.out.println("�츮�� ��ü ���ݾ��� " + sum + "���� �̿���!");
		
		//static ������� ��ȭ!
		System.out.println("----------------------------------------------");
		//��ü ���ݾ� static ���� �߰�
		System.out.println("�� ���ݾ���: " + �����ǰ.total);
		
		//��ü���ݰ��� static ���� �߰� ���
		System.out.println("�� ������ ���� ��ǰ����: " + �����ǰ.count);
	}

}
