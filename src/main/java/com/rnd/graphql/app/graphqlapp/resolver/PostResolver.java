package com.rnd.graphql.app.graphqlapp.resolver;

import com.rnd.graphql.app.graphqlapp.domain.Comment;
import com.rnd.graphql.app.graphqlapp.domain.Post;
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