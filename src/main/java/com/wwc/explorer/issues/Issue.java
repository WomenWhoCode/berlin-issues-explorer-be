package com.wwc.explorer.issues;

import java.util.List;

public class Issue {
    private String id;
    private String title;
    private List<String> labels;
    private String url;
    private String repositoryTitle;
    private String repositoryUrl;
    private String language;

    public Issue(String id, String title, List<String> labels, String url,
                 String repositoryTitle, String repositoryUrl, String language) {
        this.id = id;
        this.title = title;
        this.labels = labels;
        this.url = url;
        this.repositoryTitle = repositoryTitle;
        this.repositoryUrl = repositoryUrl;
        this.language = language;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLables(List<String> labels) {
        this.labels = labels;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRepositoryTitle() {
        return repositoryTitle;
    }

    public void setRepositoryTitle(String repositoryTitle) {
        this.repositoryTitle = repositoryTitle;
    }

    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
