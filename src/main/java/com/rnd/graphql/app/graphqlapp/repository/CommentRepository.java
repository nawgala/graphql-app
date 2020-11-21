package com.rnd.graphql.app.graphqlapp.repository;

import com.rnd.graphql.app.graphqlapp.domain.Comment;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CommentRepository {

    private final List<Comment> commentList;

    public CommentRepository() {
        this.commentList = new ArrayList<>();
        commentList.add(new Comment(1, "This is good", LocalDateTime.now()));
        commentList.add(new Comment(1, "This is even better", LocalDateTime.now()));
    }


    public  List<Comment> findCommentList() {
        return Collections.unmodifiableList(commentList);
    }

    public Boolean saveComment(Comment comment) {
        return commentList.add(comment);
    }
}
