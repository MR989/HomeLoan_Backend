package com.lti.appl.homeloan.service;

import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.model.EmiCalculator;

@Service
public class EmiCalculatorService implements IEmiCalculatorService {

	@Override
	public Double calculatemi(EmiCalculator emicalculator) {
			Double loan = emicalculator.getLoan();
			Double tenure = emicalculator.getTenure();
			Double rate = 0.085;
			Double emi =loan*rate*(Math.pow(1+rate,tenure))/Math.pow(1+rate,tenure-1);
		return emi;
	}

}