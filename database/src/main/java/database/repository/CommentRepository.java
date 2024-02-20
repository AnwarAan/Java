package database.repository;

import java.util.List;
import database.entity.Comment;

public interface CommentRepository {
  void insert(Comment comment);

  Comment findById(Integer id);

  List<Comment> findAll();

  List<Comment> findAllByEmail(String email);
}
