package com.garg.controller;

import com.garg.service.CashFlow;

public class Test {

	public static void main(String[] args) {

		CashFlow cashFlow = new CashFlow();
//		RateInput rateInput = new RateInput();
//		FreeCashFlowCalculation fcfc = new FreeCashFlowCalculation();
		cashFlow.averageCashFlow();
		
		System.out.println(cashFlow);

//		rateInput.input();
//		
//		
////		
//		fcfc.FCF();

//		rateInput.terminalRate();
//		rateInput.discountRate();
//		rateInput.firstFiveYearGrowthRate();
//		rateInput.lastFiveYearGrowthRate();

	}

}
