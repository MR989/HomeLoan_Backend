package com.lti.appl.homeloan.service;

import com.lti.appl.homeloan.exception.FileStorageException;
import com.lti.appl.homeloan.model.Document;

public interface IDocumentService {
	 public Document addCustomerDoc(Document document) throws FileStorageException;
}