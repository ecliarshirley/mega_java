package ���������;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�ũ�Ѹ�3 {
	
	public ���̹�ũ�Ѹ�3() {
		String[] code = {"005360","005930","068270"}; 
		String[] company = {"�𳪹�", "�Ｚ����", "��Ʈ����"};
		
		for (int i = 0; i < company.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
			
			Elements elist = doc.select("span.blind");
					
//			System.out.println(elist);
			
			System.out.println(company[i]);
			System.out.println("-------------------");
			
			String today = elist.get(12).text();
			System.out.println("����: " + today);
//			System.out.println(elist.get(12).text());

			String yesterday = elist.get(15).text();
			System.out.println("����: " + yesterday);
			
			String yhigh = elist.get(16).text();
			System.out.println("���� ��: " + yhigh);
			
			String siga = elist.get(19).text();
			System.out.println("�ð�: " + siga + "\n");
			
			
			FileWriter file = new FileWriter(company[i] + ".txt");
			file.write(company[i] + " ����: " + today + "\n");
			file.write(company[i] + " ����: " +yesterday + "\n");
			file.write(company[i] + " ���� ��: " +yhigh + "\n");
			file.write(company[i] + " �ð�: " +siga + "\n");
			
			file.close();
			
//			Elements elist2 = doc.select("div.wrap_company h2 a");
//			System.out.println(elist2.get(0).text());
			
		}
	}

	public static void main(String[] args) throws Exception {
		���̹�ũ�Ѹ�3 naver = new ���̹�ũ�Ѹ�3();
	}

}
