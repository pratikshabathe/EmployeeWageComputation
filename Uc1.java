package com.bl.employee;
import java.util.Random;
public class Uc1 {
	public static void main(String[] args) {
		int num = 1;
		Random rn = new Random();
		int empType = rn.nextInt(2);
		System.out.println(num);
		System.out.println(empType);
		if (empType == 0) {
			System.out.println("employee is present");
			int WagePerHr = 20;
			int FullDayHr = 8;
			int DailyEmployeeWage;
			System.out.println(DailyEmployeeWage = WagePerHr*FullDayHr);
		}
		else {
			System.out.println("employee is absent");
		}
	}
}

