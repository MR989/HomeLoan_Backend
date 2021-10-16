package com.lti.appl.homeloan.service;

import com.lti.appl.homeloan.exception.CalculatorException;
import com.lti.appl.homeloan.model.EligibiltyCalculator;

public interface IEligibilityCalculatorService {

		public Double maxLoan(EligibiltyCalculator calc) throws CalculatorException;
	
}