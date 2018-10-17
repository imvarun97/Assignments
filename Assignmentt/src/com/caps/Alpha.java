package com.caps;

public class Alpha {

	int num=52;
	void test()
	{
		num+=10;
		System.out.println(num);
	}
	public static void main(String[] args) {
		Alpha alpha =new Alpha();
		alpha.test();
	}
}
