package com.ashokit.phone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.phone.entity.Contact;
import com.ashokit.phone.repository.ContactRepository;

public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository repo;
	
	@Override
	public String upsert(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		repo.findAll();
		return null;
	}

	@Override
	public Contact getContact(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContact(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
