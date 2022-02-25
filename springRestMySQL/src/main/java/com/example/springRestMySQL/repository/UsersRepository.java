package com.example.springRestMySQL.repository;

import com.example.springRestMySQL.entity.RestUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<RestUser, String> {

}
