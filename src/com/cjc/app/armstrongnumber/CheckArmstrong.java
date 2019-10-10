package com.cjc.app.armstrongnumber;

import java.util.Scanner;

public class CheckArmstrong {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		int n= sc.nextInt();
		//int n=121;

		
		int p;
		int r, m = 0;
		p = n;
		while (n > 0) {
			r = n % 10;
			m += r * r * r;
			n = n / 10;
		}
		if (m == p) {
			System.out.println("this armstrong number");
		} else {

			System.out.println("Not armsstrong number");
		}
	}
}
