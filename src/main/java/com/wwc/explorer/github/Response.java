package com.wwc.explorer.github;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {
        private Search search;

        public Search getSearch() {
            return search;
        }

        public void setSearch(Search search) {
            this.search = search;
        }
    }

    public class Search {
        @JsonProperty("edges")
        private SearchEdge[] searchEdges;

        public SearchEdge[] getSearchEdges() {
            return searchEdges;
        }

        public void setSearchEdges(SearchEdge[] searchEdges) {
            this.searchEdges = searchEdges;
        }
    }

    public class SearchEdge {
        private String cursor;
        @JsonProperty("node")
        private SearchNode searchNode;
        private Repository repository;

        public String getCursor() {
            return cursor;
        }

        public void setCursor(String cursor) {
            this.cursor = cursor;
        }

        public SearchNode getSearchNode() {
            return searchNode;
        }

        public void setSearchNode(SearchNode searchNode) {
            this.searchNode = searchNode;
        }

        public Repository getRepository() {
            return repository;
        }

        public void setRepository(Repository repository) {
            this.repository = repository;
        }
    }

    public class SearchNode {
        private String id;
        private String title;
        private String url;
        private String state;
        @JsonProperty("labels")
        private Label label;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Label getLabel() {
            return label;
        }

        public void setLabel(Label label) {
            this.label = label;
        }
    }

    public class Label {
        @JsonProperty("edges")
        private LabelEdge labelEdge;

        public LabelEdge getLabelEdge() {
            return labelEdge;
        }

        public void setLabelEdge(LabelEdge labelEdge) {
            this.labelEdge = labelEdge;
        }
    }

    public class LabelEdge {
        @JsonProperty("node")
        private LabelNode[] labelNode;

        public LabelNode[] getLabelNode() {
            return labelNode;
        }

        public void setLabelNode(LabelNode[] labelNode) {
            this.labelNode = labelNode;
        }
    }

    public class LabelNode {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class Repository {
        private String name;
        private String url;
        private PrimaryLanguage primaryLanguage;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public PrimaryLanguage getPrimaryLanguage() {
            return primaryLanguage;
        }

        public void setPrimaryLanguage(PrimaryLanguage primaryLanguage) {
            this.primaryLanguage = primaryLanguage;
        }
    }

    public class PrimaryLanguage {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
