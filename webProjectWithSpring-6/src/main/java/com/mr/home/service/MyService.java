package com.mr.home.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mr.home.entity.Login;
import com.mr.home.repo.LoginRepo;

@Service
public class MyService {
	@Autowired
	LoginRepo loginRepo;
	Login login ;
	
	//Find all user login info
	public List<Login>getAllLoginInfo() {
		return loginRepo.findAll();
	}
	
	//Find a user login info
	public Optional<Login> getLoginInfo(int id) {
		return loginRepo.findById(id);
	}
	
	//To create a user login info
	public Login createLoginInfo(Login loginRequest) {
		//Login login = new Login();
		login.setUserName(loginRequest.getUserName());
		login.setUserPassword(loginRequest.getUserPassword());
		login = loginRepo.save(login);
		return login;
	}
	
	
	//To update a user login info
	public Login updateLoginInfo(int id, Login loginRequest) {
		Login login= new Login();
		Optional checkLoginInfo = loginRepo.findById(id);
		
		if(checkLoginInfo.isPresent()) {
			login=(Login) checkLoginInfo.get();
			login.setUserName(loginRequest.getUserName());
			login.setUserPassword(loginRequest.getUserPassword());
			login = loginRepo.save(login);
		}
		System.out.println(login);
		return login;
	}

	
	public void deleteLoginInfo(int id) {
		loginRepo.deleteById(id);
	}
	
	
	
	
	
	


}
