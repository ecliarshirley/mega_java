package 파일입출력;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버크롤링3 {
	
	public 네이버크롤링3() {
		String[] code = {"005360","005930","068270"}; 
		String[] company = {"모나미", "삼성전자", "셀트리온"};
		
		for (int i = 0; i < company.length; i++) {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + code[i]).get();
			
			Elements elist = doc.select("span.blind");
					
//			System.out.println(elist);
			
			System.out.println(company[i]);
			System.out.println("-------------------");
			
			String today = elist.get(12).text();
			System.out.println("오늘: " + today);
//			System.out.println(elist.get(12).text());

			String yesterday = elist.get(15).text();
			System.out.println("전일: " + yesterday);
			
			String yhigh = elist.get(16).text();
			System.out.println("전일 고가: " + yhigh);
			
			String siga = elist.get(19).text();
			System.out.println("시가: " + siga + "\n");
			
			
			FileWriter file = new FileWriter(company[i] + ".txt");
			file.write(company[i] + " 오늘: " + today + "\n");
			file.write(company[i] + " 전일: " +yesterday + "\n");
			file.write(company[i] + " 전일 고가: " +yhigh + "\n");
			file.write(company[i] + " 시가: " +siga + "\n");
			
			file.close();
			
//			Elements elist2 = doc.select("div.wrap_company h2 a");
//			System.out.println(elist2.get(0).text());
			
		}
	}

	public static void main(String[] args) throws Exception {
		네이버크롤링3 naver = new 네이버크롤링3();
	}

}
