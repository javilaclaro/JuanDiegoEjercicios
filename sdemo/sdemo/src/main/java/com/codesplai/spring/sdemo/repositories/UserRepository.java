package com.codesplai.spring.sdemo.repositories;

import com.codesplai.spring.sdemo.models.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
