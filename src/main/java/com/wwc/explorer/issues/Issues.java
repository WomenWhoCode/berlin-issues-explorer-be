package com.wwc.explorer.issues;

import org.eclipse.egit.github.core.RepositoryIssue;
import org.eclipse.egit.github.core.SearchIssue;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.IssueService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;
import java.util.List;

public class Issues {

    public List<RepositoryIssue> issues;
    static String language;

    public Issues(String language) throws java.io.IOException {
        this.language = language;
        this.issues = getIssuesFromGithub();
    }

    public List<RepositoryIssue> getIssues() {
        return issues;
    }

    public String getLanguage() {
        return language;
    }

    private static List<RepositoryIssue> getIssuesFromGithub() throws java.io.IOException
    {
//        String plainCreds = "applearning90:55a208a520cfbf44a665397693ecff46548bc56e";
//        byte[] plainCredBytes = plainCreds.getBytes();
//        byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredBytes);
//        String base64Creds = new String(base64CredsBytes);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", base64Creds);
//
//        HttpEntity<String> request = new HttpEntity<String>(headers);
//
//        final String uri = "https://api.github.com/search/issues?q=label:good-first-issue+state:open+language:python";
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.GET, request, String.class);

        // String result = restTemplate.exchange(uri, String.class);

        GitHubClient client = new GitHubClient();
        client.setOAuth2Token("55a208a520cfbf44a665397693ecff46548bc56e");

        IssueService issues = new IssueService();
        List<RepositoryIssue> response = issues.getIssues();
        return response;
    }

}
