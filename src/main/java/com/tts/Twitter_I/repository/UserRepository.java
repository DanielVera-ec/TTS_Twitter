package com.tts.Twitter_I.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Twitter_I.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
  public User findByUsername(String username);

}