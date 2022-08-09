package com.garg.service;

import java.util.Scanner;

import com.garg.model.CapitalExpenditure;
import com.garg.model.ImportantVariables;
import com.garg.model.OperatingCash;

public class CashFlow {

	CapitalExpenditure ce = new CapitalExpenditure();
	OperatingCash oc = new OperatingCash();
	ImportantVariables iv = new ImportantVariables();

	Scanner sc = new Scanner(System.in);

	public double averageCashFlow() {

		System.out.println("Enter two year before operating Cash");
		oc.setTwoYearBeforeOperatingCash(sc.nextDouble());
		// System.out.println("The Two year before operating cash is: " +
		// oc.getTwoYearBeforeOperatingCash());

		System.out.println("Enter last year operating Cash");
		oc.setLastYearOperatingCash(sc.nextDouble());
		// System.out.println("The last year operating cash is: " +
		// oc.getLastYeareOperatingCash());

		System.out.println("Enter current year operating Cash");
		oc.setPresentYeareOperatingCash(sc.nextDouble());
		// System.out.println("The current year operating cash is: " +
		// oc.getPresentYearOperatingCash());

		System.out.println("Enter two year before Capital Expenditure");
		ce.setTwoYearBeforeCapitalExpenditure(sc.nextDouble());
		// System.out.println("The Two year before operating cash is: " +
		// ce.getTwoYearBeforeCapitalExpenditure());

		System.out.println("Enter last year Capital Expenditure");
		ce.setLastYearCapitalExpenditure(sc.nextDouble());
		// System.out.println("The last year operating cash is: " +
		// ce.getLastYearCapitalExpenditure());

		System.out.println("Enter current year Capital Expenditure");
		ce.setPresentYearCapitalExpenditure(sc.nextDouble());
		// System.out.println("The Current year operating cash is: " +
		// ce.getPresentYearCapitalExpenditure());

		iv.setAverageNetCashFlow((((oc.getTwoYearBeforeOperatingCash() - ce.getTwoYearBeforeCapitalExpenditure())
				+ (oc.getLastYeareOperatingCash() - ce.getLastYearCapitalExpenditure())
				+ (oc.getPresentYearOperatingCash() - ce.getPresentYearCapitalExpenditure())) / 3));

		System.out.println("The Net Average Cash Flow is: " + iv.getAverageNetCashFlow());
		return iv.getAverageNetCashFlow();

	}

}
