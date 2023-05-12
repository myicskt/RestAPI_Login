package com.mr.home.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mr.home.entity.Login;
import com.mr.home.repo.LoginRepo;
import com.mr.home.service.MyService;

@RestController
public class Controller {

	@Autowired
	MyService myService;
	Login login;
	LoginRepo loginRepo;

	
	//get all userlogin info
	@GetMapping("/login")
	public List<Login> getLoginInfo() {
		return myService.getAllLoginInfo();

	}

	@GetMapping("/info/{id}")
	public Optional<Login> getInfo(@PathVariable("id") int id) {
		return myService.getLoginInfo(id);
	}

	@GetMapping("/info")
	public Optional<Login> getInfoParm(@RequestParam int id) {

		return myService.getLoginInfo(id);

	}

	@PostMapping("/create")
	public Login createUserLogin(@RequestBody Login loginInfo) {
		// Login login= null;
		login = myService.createLoginInfo(loginInfo);
		return login;

	}

// TO update the user login information by id updateLoginInfo

	@PutMapping("/updatelogininfo/{id}")
	public Login updateUserLogin(@PathVariable("id") int id, @RequestBody Login loginInfo) {

		login = myService.updateLoginInfo(id, loginInfo);
		return login;

	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudentById(@PathVariable("id") int id){
	
		myService.deleteLoginInfo(id);
		
	}

}
