package com.ashokit.phone.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.phone.entity.Contact;
import com.ashokit.phone.repository.ContactRepository;
import com.ashokit.phone.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repo;
	
	@Override
	public String upsert(Contact contact) {
		Contact save = repo.save(contact);
		return "SUCCESS";
	}

	@Override
	public List<Contact> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contact getContact(int contactId) {
		Optional<Contact> optContact = repo.findById(contactId);
		if(optContact.isPresent())
		{
		return optContact.get();
		}
		return null;
	}

	@Override
	public String deleteContact(int contactId) {
		repo.deleteById(contactId);
		return "SUCCESS";
	}

}
