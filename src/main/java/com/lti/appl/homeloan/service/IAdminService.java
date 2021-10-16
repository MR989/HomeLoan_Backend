package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exception.AdminException;
import com.lti.appl.homeloan.model.Customer;
import com.lti.appl.homeloan.model.Tracker;

public interface IAdminService {
	public List<Customer> getCustomerList()throws AdminException;
	public Customer getCustomerData(Integer appId)throws AdminException;
	public Customer updateCustomer(Customer customer) throws AdminException;
	public Tracker approve(Tracker tracker) throws AdminException;
	public Tracker reject(Tracker tracker) throws AdminException;
	
}