package com.wwc.explorer.issues;

import com.wwc.explorer.query.QueryIssuesByLabel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Response;
import java.util.Arrays;

@Service
public class GithubService {

    @Value("${GITHUB_ACCESS_TOKEN}")
    private String githubAccessToken;


    public String getString() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + githubAccessToken);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<String>(QueryIssuesByLabel.queryByLabelGoodFirstIssue(), headers);
        ResponseEntity<Response> response = restTemplate.exchange("https://api.github.com/graphql", HttpMethod.POST, requestEntity, Response.class);
        String issues = response.getBody().toString();



        return issues;
    }


}
