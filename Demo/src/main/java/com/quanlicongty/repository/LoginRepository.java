package com.quanlicongty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.quanlicongty.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
	@Query(value = "select count(username) from login where username =?1", nativeQuery = true)
	int checkExits(String userName);
	
	Login findByUsername(String username);

}
