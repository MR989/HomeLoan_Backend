package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.PropertyAndIncome;

public interface ICustPropertyAndIncomeService {
	public List<PropertyAndIncome> getPropertyIncomeList()throws LoanException;
	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome)throws LoanException;
}