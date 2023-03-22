package com.ashokit.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.phone.entity.Contact;
import com.ashokit.phone.service.ContactService;

@RestController
@RequestMapping("/api")
public class ContactRestController {

	@Autowired
	ContactService service;

	@PostMapping("/contact")
	public ResponseEntity<String> contact(@RequestBody Contact contact) {
		String status = service.upsert(contact);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAllContacts() {
		List<Contact> lst = service.getAllContacts();
		return new ResponseEntity<>(lst, HttpStatus.OK);
	}

	@GetMapping("/contact/{cid}")
	public ResponseEntity<Contact> getContact(@PathVariable int contactId) {
		Contact contact = service.getContact(contactId);
		return new ResponseEntity<>(contact, HttpStatus.OK);
	}

	@DeleteMapping("/contact/{cid}")
	public ResponseEntity<String> deleteContact(@PathVariable int contactId) {
		String deleteContact = service.deleteContact(contactId);
		return new ResponseEntity<>(deleteContact, HttpStatus.OK);
	}
}
