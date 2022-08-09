package com.garg.service;

public class Test {

	public static void main(String[] args) {
		System.out.println("-----All in crores-----");
		CashFlow cashFlow = new CashFlow();
		RateInput rateInput = new RateInput();
		FreeCashFlowCalculation fcfc = new FreeCashFlowCalculation();
		cashFlow.averageCashFlow();

		rateInput.input();
		
		fcfc.FCF();
//		rateInput.terminalRate();
//		rateInput.discountRate();
//		rateInput.firstFiveYearGrowthRate();
//		rateInput.lastFiveYearGrowthRate();

	}

}
