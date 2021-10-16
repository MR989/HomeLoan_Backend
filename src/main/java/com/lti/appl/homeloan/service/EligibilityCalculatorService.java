package com.lti.appl.homeloan.service;

import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.exception.CalculatorException;
import com.lti.appl.homeloan.model.EligibiltyCalculator;

@Service
public class EligibilityCalculatorService implements IEligibilityCalculatorService {

	@Override
	public Double maxLoan(EligibiltyCalculator calc) throws CalculatorException {
		
		return 60*(0.6*calc.getmonthlyIncome());
	}

}