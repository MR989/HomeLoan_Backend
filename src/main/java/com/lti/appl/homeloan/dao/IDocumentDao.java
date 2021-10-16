package com.lti.appl.homeloan.dao;

import com.lti.appl.homeloan.exception.FileStorageException;
import com.lti.appl.homeloan.model.Document;

public interface IDocumentDao {

	public Document addCustomerDoc(Document doc) throws FileStorageException;
}