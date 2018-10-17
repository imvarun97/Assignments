package com.caps;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;

class A
{
void test() throws IOException{
}
}
class Overridin extends A
{
	void test()throws IOException {
		FileReader f =new FileReader("F:/c.txt");
	
	}
}
public class Overriding{
	public static void main(String Args[])throws IOException{
		
		{
			Overridin o=new Overridin();
			o.test();
			System.out.println("ended");
		}
		
	}
	
}
