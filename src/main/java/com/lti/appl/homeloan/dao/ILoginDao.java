package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exception.LoginException;
import com.lti.appl.homeloan.model.Login;
;

public interface ILoginDao {

	public List<Login> getLoginList()throws LoginException;
	public Login authenticateCustomer(Login login)throws LoginException;
	public String authenticateRole(Login login)throws LoginException;
}
