package ����;

public class ���� {
	//��������(global ����)
	//���������� �ڵ����� �ʱ�ȭ �ȴ�.
	String accountName; //���¸�
	String name;		//����̸�
	int money;			//�ʱ��Աݾ� = 0;
	
	
	//������: ��ü ������ �ڵ� ȣ�� �޼��� //Source tab -> Constructor using Fields
	public ����(String accountName, String name, int money) {
		this.accountName = accountName;
		this.name = name;
		this.money = money;
//		int num; //������ �� ����
//		System.out.println(this.money); //��������
//		System.out.println(num);		//��������. ������ �� ���¶� ������ ���.
	}


	@Override
	public String toString() {
		return "���� [accountName=" + accountName + ", name=" + name + ", money=" + money + "]";
	}
	
	
	
}
