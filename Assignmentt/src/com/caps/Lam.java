package com.caps;

import java.util.function.BiFunction;

public class Lam {
		public static void main(String[] args) {
			BiFunction<Integer,Integer,Boolean>IsMax=(x,y)->{return(x>y?true:false);};
			System.out.println(IsMax.apply(45, 50));
		}
		}


