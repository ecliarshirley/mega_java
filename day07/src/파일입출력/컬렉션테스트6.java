package ���������;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class �÷����׽�Ʈ6 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		//MAP �� ������
		HashMap map = new HashMap();
		map.put("1", "����");
		map.put("2","�ƺ�");
		map.put("3","ģ��");
		map.put("4","����");
		
		System.out.println(map.get("1"));
		
		
		ArrayList list2 = new ArrayList();
		list2.add("�ڼ���");
		list2.add("������");
		list2.add("������");
		list2.add("�谳��");
		
		list2.remove(1);
		System.out.println(list2);
		
		HashSet team = new HashSet();
		team.add("���α׷���");
		team.add("DB������");
		team.add("������Ʈ �Ŵ���");
		team.add("�������̳�");
		System.out.println(team);
		
		
	}

}
