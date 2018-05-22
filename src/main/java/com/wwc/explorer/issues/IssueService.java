package com.wwc.explorer.issues;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IssueService {

    private List<Issue> issues = new ArrayList<>(Arrays.asList(
            new Issue(
                    "12345",
                    "Serverless Application Repository",
                    new ArrayList<String>(Arrays.asList("good-first-issue")),
                    "aws-lambda-attachment-extractor",
                    "https://github.com/martysweet/aws-lambda-attachment-extractor/issues/2",
                    "Python")));

    public List<Issue> getAllIssues() {
        return issues;
    }
}
