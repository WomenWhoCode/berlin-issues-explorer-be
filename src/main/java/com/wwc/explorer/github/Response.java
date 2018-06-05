package com.wwc.explorer.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

    @JsonProperty
    private Data data;

    public static class Data {
        @JsonProperty
        private Search search;
    }

    public static class Search {
        @JsonProperty
        private SearchEdge[] edges;
    }

    public static class SearchEdge {
        @JsonProperty
        private String cursor;
        @JsonProperty
        private SearchNode node;
        @JsonProperty
        private Repository repository;
    }

    public static class SearchNode {
        @JsonProperty
        private String id;
        @JsonProperty
        private String title;
        @JsonProperty
        private String url;
        @JsonProperty
        private String state;
        @JsonProperty
        private Label labels;
    }

    public static class Label {
        @JsonProperty
        private LabelEdge[] edges;
    }

    public static class LabelEdge {
        @JsonProperty
        private LabelNode node;
    }

    public static class LabelNode {
        @JsonProperty
        private String name;
    }


    public static class Repository {
        @JsonProperty
        private String name;
        @JsonProperty
        private String url;
        @JsonProperty
        private PrimaryLanguage primaryLanguage;
    }

    public static class PrimaryLanguage {
        @JsonProperty
        private String name;
    }
}
