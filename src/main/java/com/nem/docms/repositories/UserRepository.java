package com.nem.docms.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nem.docms.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	User findByUsername(String username);
}
