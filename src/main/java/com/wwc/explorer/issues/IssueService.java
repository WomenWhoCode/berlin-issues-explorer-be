package com.wwc.explorer.issues;

import com.wwc.explorer.github.Response;
import com.wwc.explorer.query.QueryIssuesByLabel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class IssueService {

    @Value("${GITHUB_ACCESS_TOKEN}")
    private String githubAccessToken;

    // Scheduled to run every three hours
    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getAllIssues() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelGoodFirstIssue(), headers).getBody();
    }

    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getUpForGrabs() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelUpForGrabs(), headers).getBody();
    }

    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getBeginnerFriendly() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelBeginnerFriendly(), headers).getBody();
    }

    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getFirstTimersOnly() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelFirstTimersOnly(), headers).getBody();
    }

    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getNewComer() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelNewcomer(), headers).getBody();
    }

    @Scheduled(cron = "0 0 */3 ? * *")
    public com.wwc.explorer.github.Response getJumpIn() {
        HttpHeaders headers = setUpHeaders();
        return setUpRestTemplate(QueryIssuesByLabel.queryByLabelJumpIn(), headers).getBody();
    }

    private HttpHeaders setUpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + githubAccessToken);

        return headers;
    }

    private ResponseEntity<Response> setUpRestTemplate(String label, HttpHeaders headers) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(label, headers);

        return restTemplate.exchange("https://api.github.com/graphql", HttpMethod.POST, requestEntity, Response.class);
    }
}
