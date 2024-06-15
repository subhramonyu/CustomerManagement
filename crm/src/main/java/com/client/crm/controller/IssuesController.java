package com.client.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.client.crm.entity.Issues;
import com.client.crm.service.IssuesService;

@Controller
public class IssuesController {

	private IssuesService issueservice;

	public IssuesController(IssuesService issuesservice) {
		super();
		this.issueservice = issuesservice;
	}

	@GetMapping("/issue/new")
	public String createnewIssue(Model model) {
		Issues issue = new Issues();
		model.addAttribute("issue", issue);
		return "create_issues";
	}

	@PostMapping("/issues")
	public String saveIssue(@ModelAttribute("issue") Issues issues) {
		issueservice.saveIssue(issues);
		return "redirect:/home";
	}

}
