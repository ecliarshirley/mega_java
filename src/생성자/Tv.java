package ������;

public class Tv {

		//������ Ư¡ => �������
		int ch;
		int vol;
		boolean onOff;
//		
		//������.
		//��ü������ �ڵ����� ȣ��
		public Tv(){
			System.out.println("��ü ������ ���� �ڵ� ȣ��Ǿ��");
		}
		
		public Tv(int c, int v, boolean o) {
			ch = c;
			vol = v;
			onOff = o;
		}
		
		
		//������ Ư¡ => ����޼ҵ�
		public void powerOn() {
			System.out.println("TV�� �Ѵ�.");
		}
		
		public void powerOff() {
			System.out.println("TV�� ����.");
		}
		
		@Override   // (������) //�ּҰ��� �ƴ� ���ϴ� ������ ������
		public String toString() {
			return ch + ", " + vol + ", " + onOff;
		}



}

