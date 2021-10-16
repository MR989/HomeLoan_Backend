package com.lti.appl.homeloan.service;

import com.lti.appl.homeloan.exception.CalculatorException;
import com.lti.appl.homeloan.model.EmiCalculator;

public interface IEmiCalculatorService {

	public Double calculatemi(EmiCalculator emicalculator) throws CalculatorException;
}