package com.packge.in;

public class primeNumbersClass {
public static void main(String[] args) {
	int n=10;
	int i =1;
	int count =0;
	while(i<=n) {
		
		if(n%i==0) {
			count++;
		}
		i++;
	}
	if(count==2) {
		
		System.out.println("{prime number");
	}
	else
	{
	System.out.println("not prime");	
	}
}
}
