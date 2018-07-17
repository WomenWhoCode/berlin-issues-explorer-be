package com.wwc.explorer.repository;

import com.wwc.explorer.repository.model.Issue;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IssueRepository extends CrudRepository<Issue, Long> {

    List<Issue> findByState(String language);
}
