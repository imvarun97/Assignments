package com.caps;

import java.io.IOException;

public class Exception {
public void method()throws IOException{
}
}
class Derived extends Exception
{
	public void method() throws ArithmeticException{}
}
