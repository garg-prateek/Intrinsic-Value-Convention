package com.garg.controller;

import com.garg.model.OutputVariable;
import com.garg.service.CashFlow;

public class Controller {

	public static void main(String[] args) {

		CashFlow cashFlow = new CashFlow();
//		RateInput rateInput = new RateInput();
//		FreeCashFlowCalculation fcfc = new FreeCashFlowCalculation();
		OutputVariable output = cashFlow.averageCashFlow();

		System.out.println(output);

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
