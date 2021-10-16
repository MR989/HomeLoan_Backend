package com.lti.appl.homeloan.service;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Tracker;

public interface ITrackerService {
	
	public Integer getStatusById(Tracker tracker)throws LoanException;

}
