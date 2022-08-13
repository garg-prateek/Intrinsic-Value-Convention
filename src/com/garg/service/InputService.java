package com.garg.service;

import java.util.Scanner;

import com.garg.model.CapitalExpenditure;
import com.garg.model.ImportantVariables;
import com.garg.model.OperatingCash;
import com.garg.model.Rate;

public class InputService {
	CapitalExpenditure ce;
	OperatingCash oc;
	ImportantVariables iv;
	Rate rate;
	
	public InputService(CapitalExpenditure ce,OperatingCash oc,ImportantVariables iv,Rate rate) {
//		ce = new CapitalExpenditure();
//		oc = new OperatingCash();
//		iv = new ImportantVariables();
//		rate = new Rate();
		
		ce = this.ce;
		oc = this.oc;
		iv= this.iv;
		rate = this.rate;
		input();
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----All in crores-----");
		System.out.println(
				"All You should have is the 'BALANCE SHEET' of company, which can be downloaded from the company's website");

		System.out.println("Enter two year before operating Cash");
		oc.setTwoYearBeforeOperatingCash(sc.nextDouble());

		System.out.println("Enter last year operating Cash");
		oc.setLastYearOperatingCash(sc.nextDouble());

		System.out.println("Enter current year operating Cash");
		oc.setPresentYeareOperatingCash(sc.nextDouble());

		System.out.println("Enter two year before Capital Expenditure");
		ce.setTwoYearBeforeCapitalExpenditure(sc.nextDouble());

		System.out.println("Enter last year Capital Expenditure");
		ce.setLastYearCapitalExpenditure(sc.nextDouble());

		System.out.println("Enter current year Capital Expenditure");
		ce.setPresentYearCapitalExpenditure(sc.nextDouble());

		iv.setAverageNetCashFlow((((oc.getTwoYearBeforeOperatingCash() - ce.getTwoYearBeforeCapitalExpenditure())
				+ (oc.getLastYeareOperatingCash() - ce.getLastYearCapitalExpenditure())
				+ (oc.getPresentYearOperatingCash() - ce.getPresentYearCapitalExpenditure())) / 3));

		System.out.println("The Net Average Cash Flow is: " + iv.getAverageNetCashFlow());

		System.out.println("Please Enter All Values Of Rate In Percentage");

		System.out.println("Enter the terminal rate");
		rate.setTerminalGrowthRate(sc.nextDouble());

		System.out.println("Enter the discount Rate");
		rate.setDiscountRate(sc.nextDouble());

		System.out.println("Enter first five year growth rate of Free Cash Flow");
		rate.setFirstFiveYearGrowthRate(sc.nextDouble());

		System.out.println("Enter last five year growth rate of Free Cash Flow");
		rate.setLastFiveYearGrowthRate(sc.nextDouble());
		
		
		
		System.out.println("Enter Total Outstanding Shares Of company ");
		iv.setTotalShares(sc.nextDouble());

		System.out.println("Enter Net Debt OF company ");
		iv.setNetDebt(sc.nextDouble());

		System.out.println("Enter Total Cash & Cash Equivalents Of company ");
		iv.setCashAndCashEquivalents(sc.nextDouble());

		System.out.println("Enter Total Bank Balance Of company ");
		iv.setBankBalance(sc.nextDouble());
		sc.close();

	}
}
