package com.wwc.explorer.issues;

import org.springframework.web.client.RestTemplate;

public class Issues {

    public String issues;
    static String language;

    public Issues(String language) {
        this.language = language;
        this.issues = getIssuesFromGithub();
    }

    public String getIssues() {
        return issues;
    }

    public String getLanguage() {
        return language;
    }

    private static String getIssuesFromGithub()
    {
        final String uri = "https://api.github.com/search/issues?q=label:good-first-issue+state:open+language:" + language;

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        return result;
    }
}
