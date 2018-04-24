package com.wwc.explorer.issues;

import org.eclipse.egit.github.core.RepositoryIssue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;


@RestController
public class IssuesController {

    @RequestMapping("/")
    public String index() {
        return "Stay tuned. This service will soon start serving github issues for opensource newbies.";
    }

    @RequestMapping("/issues")
    @ResponseBody
    public List<RepositoryIssue> issues() throws java.io.IOException {

        Issues list = new Issues("java");

        return list.getIssues();
    }

}
