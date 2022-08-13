package com.garg.controller;

import com.garg.model.CapitalExpenditure;
import com.garg.model.ImportantVariables;
import com.garg.model.OperatingCash;
import com.garg.model.OutputVariable;
import com.garg.model.Rate;
import com.garg.service.CashFlowService;
import com.garg.service.InputService;

public class Controller {

	public static void main(String[] args) {
		CapitalExpenditure ce = new CapitalExpenditure();
		OperatingCash oc = new OperatingCash();
		ImportantVariables iv = new ImportantVariables();
		Rate rate = new Rate();
		new InputService(ce, oc, iv, rate);
		System.out.println(Controller.apicall(ce, oc, iv, rate));

	}
	
	public static OutputVariable apicall(CapitalExpenditure ce,OperatingCash oc,ImportantVariables iv,Rate rate) {
		CashFlowService cashFlow = new CashFlowService(ce, oc, iv, rate);
		return cashFlow.averageCashFlow();
	}

}
