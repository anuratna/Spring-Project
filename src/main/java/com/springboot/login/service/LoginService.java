package com.springboot.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.login.model.LoginUser;
import com.springboot.login.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository; 

	public LoginUser insert(LoginUser loginuser) {
		return loginRepository.save(loginuser);
	}

	public LoginUser validatedata(LoginUser logincredentials) {		
		return loginRepository.findByUserName(logincredentials.getUserName());
	}
	
	public void deleteData(String userName)
	{
		System.out.println("username in service   " +userName);
		 loginRepository.deleteByUserName(userName);
		
	}
	
	public LoginUser getData(String userName)
	{
		return loginRepository.findByUserName(userName);
	}
	
	public LoginUser updateData(LoginUser user)
	{
		return loginRepository.save(user);
		
	}
	

} 
