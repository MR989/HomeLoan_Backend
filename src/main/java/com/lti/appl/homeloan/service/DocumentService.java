package com.lti.appl.homeloan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.dao.IDocumentDao;
import com.lti.appl.homeloan.exception.FileStorageException;
import com.lti.appl.homeloan.model.Document;

@Service
@Transactional
public class DocumentService implements IDocumentService{

	@Autowired
	private IDocumentDao docDao;

	@Override
	@Transactional
       public Document addCustomerDoc(Document document) throws FileStorageException {
		return docDao.addCustomerDoc(document);
	}

}
