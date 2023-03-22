package com.ashokit.phone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACTDETAILS")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer contactId;
	
	@Column(name="NAME")
	private String contactName;
	
	@Column(name="EMAIL")
	private String contactEmail;
	
	private Long phoneNo;
	
	private String activeSw;
}