package com.ashokit.phone.service;

import java.util.List;

import com.ashokit.phone.entity.Contact;

public interface ContactService {

	public String upsert (Contact contact);

	public List<Contact> getAllContacts( );

	public Contact getContact (int contactId);

	public String deleteContact (int contactId);
}
