package com.jse.algorithm;

public class Sum1To5 {
	public static void main(String[] args) {
		sum();
	}
/*
	static void sum() {
		
		int sum=0;
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			sum += i;
		}	
			System.out.println(String.format("%d", sum));
		
	}
}

*/


static void sum() {
	int sum=0;
	for (int i=1;i<=100;i++) {
		System.out.println(i);
	sum += i;
	}
		
		System.out.println(String.format("%d", sum));
}
}