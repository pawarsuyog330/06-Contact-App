package com.ashokit.phone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.phone.entity.Contact;
import com.ashokit.phone.service.ContactService;

@RestController
public class ContactRestController {
	
	@Autowired
	ContactService service;

	@PostMapping("/contact")
	ResponseEntity<String> Contact (Contact contact)
	{
		
	}

	@GetMapping("/contacts")
	ResponseEntity<List<Contact>> getAllContacts( )
	{
		
	}

	@GetMapping("/contact/{cid}")
	ResponseEntity<Contact> getContact(@PathVariable int cid)
	{
		
	}

	@DeleteMapping("/contact/{cid}")
	ResponseEntity<String> deleteContact(@PathVariable int cid)
	{
		
	}
}
