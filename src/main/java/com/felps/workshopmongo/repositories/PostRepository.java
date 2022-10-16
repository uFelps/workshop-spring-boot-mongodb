package com.felps.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.felps.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
