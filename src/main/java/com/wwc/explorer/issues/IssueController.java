package com.wwc.explorer.issues;

import org.eclipse.egit.github.core.RepositoryIssue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
public class IssueController {

    @Autowired
    IssueService issueService;

    @RequestMapping("/")
    public String index() {
        return "Stay tuned. This service will soon start serving github issues for opensource newbies.";
    }

    @RequestMapping("/issues")
    public List<Issue> issues() {

        return issueService.getAllIssues();
    }

}
