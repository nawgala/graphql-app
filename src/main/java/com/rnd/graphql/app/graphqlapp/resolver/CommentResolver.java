package com.rnd.graphql.app.graphqlapp.resolver;

import com.rnd.graphql.app.graphqlapp.domain.Comment;
import com.rnd.graphql.app.graphqlapp.repository.CommentRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class CommentQueryResolver implements GraphQLQueryResolver {
    private final CommentRepository commentRepository;

    public CommentQueryResolver(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> findCommentList() {
        return commentRepository.findCommentList();
    }

}


@Component
class CommentMutationResolver implements GraphQLMutationResolver {

    private final CommentRepository commentRepository;

    public CommentMutationResolver(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Boolean saveComment(Long id, String title) {
        return commentRepository.saveComment(new Comment(id, title));
    }
}
