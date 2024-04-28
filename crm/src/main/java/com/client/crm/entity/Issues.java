package com.client.crm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="issues")
public class Issues {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="reference_Id")
	private String referenceId;

	
	@Column(name="Issue_Type")
	private String IssueType;
	
	@Column(name="description")
	private String description;
	
	@Column(name="contact_email")
	private String contact_email;
	
	@Column(name="contact_phone")
	private String contact_phone;
	
	public Issues() {}
	
	public Issues(String IssueType,String referenceId) {
		super();
		this.IssueType = IssueType;
		this.referenceId = referenceId;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getIssueType() {
		return IssueType;
	}

	public void setIssueType(String issueType) {
		IssueType = issueType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact_email() {
		return contact_email;
	}

	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}

	public String getContact_phone() {
		return contact_phone;
	}

	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}

	

}
