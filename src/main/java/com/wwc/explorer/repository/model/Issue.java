package com.wwc.explorer.repository.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Getter
    @Setter
    private String githubId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String url;

    @Getter
    @Setter
    private String state;

    protected Issue() {}

    public Issue(String id, String githubId, String title, String url, String state, List<String> labels) {
        this.id = id;
        this.githubId = githubId;
        this.title = title;
        this.url = url;
        this.state = state;
    }

    @Override
    public String toString() {
        return String.format(
                "Issue[id=%s, githubId=%s, title=%s, url=%s, state=%s]",
                id, githubId, title, url, state);
    }
}
