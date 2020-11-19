package com.rnd.graphql.app.graphqlapp;

import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
class PostResolver implements GraphQLResolver<Post> {

    public List<Comment> getComments(Post post) {
        return Collections.emptyList();
    }

}