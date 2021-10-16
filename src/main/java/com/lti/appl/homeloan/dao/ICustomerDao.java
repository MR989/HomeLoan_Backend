package com.lti.appl.homeloan.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Customer;
import com.lti.appl.homeloan.model.Document;
import com.lti.appl.homeloan.model.Loan;
import com.lti.appl.homeloan.model.PropertyAndIncome;

public interface ICustomerDao {
	public List<Customer> getCustomerList(String username,HttpSession session)throws LoanException;
	public Customer addCustomerDetails(Customer customer,Loan loan, PropertyAndIncome propertyAndIncome, List<Document> document)throws LoanException;
}