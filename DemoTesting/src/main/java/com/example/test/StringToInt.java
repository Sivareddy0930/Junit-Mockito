package com.example.test;

public class StringToInt {
	public static  Integer convertStringToInt(String s) {
		if(s.isEmpty()|| s == null) {
			throw new IllegalArgumentException("Throws IllegalArgumentException");
		}
		return Integer.valueOf(s);
	}
}
