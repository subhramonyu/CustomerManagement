package com.client.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.crm.entity.Issues;

public interface IssuesRepository  extends JpaRepository<Issues, Long>{

}
