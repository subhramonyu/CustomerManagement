package com.client.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.client.crm.entity.Issues;
import com.client.crm.repository.IssuesRepository;

@Service
public class IssuesService {
	
	private IssuesRepository issuesRepository;
	
	public IssuesService(IssuesRepository issuesRepository) {
		super();
		this.issuesRepository = issuesRepository;
	}
	
	public Issues saveIssue(Issues issue) {
		return issuesRepository.save(issue);
	}

	public List<Issues> getAllIssues(){
		return issuesRepository.findAll();
	}
	
}
