package ����;

public class ��������2 {

	public static void main(String[] args) {
		byte b = 100; 	//1����Ʈ (127)
		int i = b;		//4����Ʈ <--1����Ʈ
		//�� --> ū : �ڵ�����ȯ
		
		int i2 = 100;  	//4����Ʈ
		byte b2 = (byte)i2;	//byte�� ���� ������ ����Ʈ 127 ���� ũ�⸸ �۰� ���̱� ����.
		//ū --> �� : ��������ȯ
		
		//����ȯ (=casting)
		//ū <--- �� : �ڵ�����ȯ
		byte b3 = 100;		//1����Ʈ
		long l1 = b3;		//8����Ʈ
		
		//�� <--- ū: ��������ȯ
		long l2 = 100L;		//long�� �ڿ� L�� ���.
		int i3 = (int)l2;
		
	}

}
