package ����ƽ;

public class �����ǰ {
		//class �ؿ��� �ڵ����� �ʱ�ȭ �ȴ�. 
		// eg. int money = 0; eg. String product = null;
		String product;
		String name;
		int money;
		static int count;  //���¼� 
		static int total;  //money ����
		
		public static void printCount() {
			System.out.println(count);
		}
		
		//������
		public �����ǰ(String product, String name, int money) {
			count++;
			total = total + money;
			this.product = product;
			this.name = name;
			this.money = money;
		}
		
		@Override
		public String toString() {
		return product+ ", " + name +", " + money;
		}
	
}
