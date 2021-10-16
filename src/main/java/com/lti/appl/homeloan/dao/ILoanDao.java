package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Loan;

public interface ILoanDao {
	public List<Loan> getLoanList()throws LoanException;
	public Loan addLoanDetails(Loan loan)throws LoanException;
}