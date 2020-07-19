package com.tts.Twitter_I.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Twitter_I.model.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
  public Role findByRole(String role);
  
}