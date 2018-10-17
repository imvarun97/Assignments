package com.caps;

import java.util.Arrays;
import java.util.List;

public class CollEx {

	public static void main(String[] args) {
		List<Integer>li=Arrays.asList(10,20,30,40,50,60);
System.out.println(li.stream().reduce((prev,current)->prev+current));

	}
}
