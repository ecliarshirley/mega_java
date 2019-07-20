package ¹Ýº¹¹®;

import java.util.Random;
import java.util.Scanner;

public class WhileTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int target = r.nextInt(100);
		int count = 0;

		while (true) {
			count++;
			System.out.println("»ý°¢ÇÑ ¼ýÀÚ¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
			int data = sc.nextInt();

			if (data == target) {
				System.out.println("ÃàÇÏÇÕ´Ï´Ù. ¸Â­Ÿ½À´Ï´Ù.");
				System.out.println("´ç½ÅÀÌ ½ÇÆÐÇÑ È½¼ö´Â: " + (count-1) + "È¸");
				break;
			} else {
				if (data > target) {
					System.out.println("³Ê¹« Å®´Ï´Ù");
				} else {
					System.out.println("³Ê¹« ÀÛ½À´Ï´Ù.");
				}

				System.out.println("´Ù½ÃÇÏ¼¼¿ä");
			}

		}

	}

}
