package com.wwc.explorer.issues;

import java.util.List;

public class Issue {
    private String title;
    private List<String> labels;
    private String repositoryTitle;
    private List<String> repositoryLabels;
    private String repositoryUrl;
    private String language;

    public Issue(String title,
                 List<String> labels,
                 String repositoryTitle,
                 List<String> repositoryLabels,
                 String repositoryUrl,
                 String language) {
        this.title = title;
        this.labels = labels;
        this.repositoryTitle = repositoryTitle;
        this.repositoryLabels = repositoryLabels;
        this.repositoryUrl = repositoryUrl;
        this.language = language;
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

    public String getRepositoryTitle() {
        return repositoryTitle;
    }

    public void setRepositoryTitle(String repositoryTitle) {
        this.repositoryTitle = repositoryTitle;
    }

    public List<String> getRepositoryLabels() {
        return repositoryLabels;
    }

    public void setRepositoryLabels(List<String> repositoryLabels) {
        this.repositoryLabels = repositoryLabels;
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
