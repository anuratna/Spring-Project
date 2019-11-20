package com.springboot.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.login.model.LoginUser;


public interface LoginRepository extends JpaRepository<LoginUser, String>{
	
	LoginUser findByUserName(String userName);

	@Modifying
	@Transactional
	@Query(value = "DELETE from LoginUser WHERE userName = ?",nativeQuery = true)
	void deleteByUserName(String userName);

//	Object exists(String userName);
	
/*
	@Modifying
	@Transactional
	@Query(value = "UPDATE login_user l SET l.name=?1, l.last_name=?2,l.date_of_birth=?3 WHERE l.user_name = ?4")
	void updateDetails(String firstName, String lastName, Date dateOfBirth, String userName);*/ 
	
   
}
