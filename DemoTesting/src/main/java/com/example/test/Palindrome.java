package com.example.test;

public class Palindrome {
	public boolean isPalindrome(String s) {
		String rev="";
		
		for(int i= s.length()-1;i >= 0;i--) {
			rev = rev + s.charAt(i);
		}
		if(s.equals(rev)) {
			return true;
		}
		return false;
	}
	

}
