package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exception.LoginException;
import com.lti.appl.homeloan.model.Login;

public interface ILoginService {

	public List<Login> getLoginList()throws LoginException;
	public Login authenticateCustomer(Login login)throws LoginException;
	public String authenticateRole(Login login)throws LoginException;
}