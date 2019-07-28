package ½ºÅÂÆ½;

public class ¾ÆºüÁö°© {

	static int money = 10000;
	static int count;
	String name;
	int h;
	
	public ¾ÆºüÁö°©(String name, int h) {
		count++;
		money = money - 1000;
		this.name = name;
		this.h = h;
	}


	@Override
	public String toString() {
		return name +", "+  h ;
	}
	

	
	
}
