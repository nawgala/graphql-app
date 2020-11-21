package com.rnd.graphql.app.graphqlapp.resolver;

import com.rnd.graphql.app.graphqlapp.domain.Post;
import graphql.kickstart.tools.GraphQLMutationResolver;
import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    public Post createPost(String text){
        Post post = new Post(new Random().nextLong());
        post.setText(text);
        return post;
    }
}