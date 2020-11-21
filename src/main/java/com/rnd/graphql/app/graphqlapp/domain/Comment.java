package com.rnd.graphql.app.graphqlapp.domain;

public class Comment {
    private final Long id;
    private final String title;

    public Comment(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
