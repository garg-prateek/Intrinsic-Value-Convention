package com.garg.service;

import com.garg.model.Rate;
import java.util.Scanner;

public class RateInput {

	Rate rate = new Rate();
	Scanner sc = new Scanner(System.in);

	public void input() {

		System.out.println("Please Enter All Values Of Rate In Percentage");

		System.out.println("Enter the terminal rate");
		rate.setTerminalGrowthRate(sc.nextDouble());

		System.out.println("Enter the discount Rate");
		rate.setDiscountRate(sc.nextDouble());

		System.out.println("Enter first five year growth rate of Free Cash Flow");
		rate.setFirstFiveYearGrowthRate(sc.nextDouble());

		System.out.println("Enter last five year growth rate of Free Cash Flow");
		rate.setLastFiveYearGrowthRate(sc.nextDouble());

//	public double terminalRate() {
//		System.out.println("Enter the terminal rate ");
//		rate.setTerminalGrowthRate(sc.nextDouble());
//
//		return rate.getTerminalGrowthRate();
//	}
//
//	public double discountRate() {
//		System.out.println("Enter the terminal rate ");
//		rate.setDiscountRate(sc.nextDouble());
//
//		return rate.getDiscountRate();
//	}
//
//	public double firstFiveYearGrowthRate() {
//		System.out.println("Enter the terminal rate ");
//		rate.setFirstFiveYearGrowthRate(sc.nextDouble());
//
//		return rate.getFirstFiveYearGrowthRate();
//	}
//
//	public double lastFiveYearGrowthRate() {
//		System.out.println("Enter the terminal rate ");
//		rate.setLastFiveYearGrowthRate(sc.nextDouble());
//
//		return rate.getLastFiveYearGrowthRate();
//	}

//	public void input() {
//		RateInput rate = new RateInput();
//		rate.terminalRate();
//		rate.discountRate();
//		rate.firstFiveYearGrowthRate();
//		rate.lastFiveYearGrowthRate();
//
//	}

	}
}