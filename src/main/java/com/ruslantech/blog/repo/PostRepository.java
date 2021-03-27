package com.ruslantech.blog.repo;

import com.ruslantech.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
