package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Loan;

public interface ILoanService {
	public List<Loan> getLoanList()throws LoanException;
	public Loan addLoanDetails(Loan loan)throws LoanException;
}