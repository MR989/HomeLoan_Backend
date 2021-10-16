package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.PropertyAndIncome;

public interface ICustPropertyAndIncomeDao {
	public List<PropertyAndIncome> getPropertyIncomeList()throws LoanException;
	public PropertyAndIncome addPropertyAndIncomeDetails(PropertyAndIncome propertyAndIncome)throws LoanException;
}