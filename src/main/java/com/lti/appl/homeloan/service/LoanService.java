package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.dao.ILoanDao;
import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Loan;

@Service
public class LoanService implements ILoanService{
	@Autowired
	private ILoanDao loanDao;
	
	public ILoanDao getLoanDao() {
		return loanDao;
	}

	public void setLoanDao(ILoanDao loanDao) {
		this.loanDao = loanDao;
	}

	@Override
	@Transactional
	public List<Loan> getLoanList() throws LoanException {
		return loanDao.getLoanList();
	}

	@Override
	@Transactional
	public Loan addLoanDetails(Loan loan) throws LoanException {
		return loanDao.addLoanDetails(loan);
	}

}