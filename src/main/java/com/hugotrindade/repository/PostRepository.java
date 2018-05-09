package com.hugotrindade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hugotrindade.domain.Post;

public interface PostRepository  extends MongoRepository<Post, String>{

}
