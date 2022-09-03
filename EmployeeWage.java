package com.bl.employee;

import java.util.Scanner;

public class EmployeeWage {
	public static void main(String[] args) {
		int a = 20;
		int b = 8;
		int c = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empWorkTime");
		int empWorkTime = sc.nextInt();
		switch (empWorkTime) {
		case 1:
			System.out.println("empWage time per hour:" +a);
			break;
		case 2:
			System.out.println("empWage full day hour:" +b);  
			break;
		case 3:
			System.out.println("empWage part time hour:" +c);
			break;
		default :
			System.out.println("employee is absent");
		}
	}
}

