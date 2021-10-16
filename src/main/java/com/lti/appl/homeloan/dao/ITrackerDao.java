package com.lti.appl.homeloan.dao;

import com.lti.appl.homeloan.exception.LoanException;
import com.lti.appl.homeloan.model.Tracker;

public interface ITrackerDao {
	public Integer getStatusById(Tracker tracker)throws LoanException;

}
