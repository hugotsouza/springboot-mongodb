package com.hugotrindade.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hugotrindade.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
