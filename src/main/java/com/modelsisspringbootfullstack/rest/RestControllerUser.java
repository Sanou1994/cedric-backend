package com.modelsisspringbootfullstack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;
import com.modelsisspringbootfullstack.entities.Login;
import com.modelsisspringbootfullstack.iservice.IUserService;
import com.modelsisspringbootfullstack.utils.Utility;

@RestController
public class RestControllerUser {
	@Autowired
	private IUserService iUserService;
	@PostMapping(Utility.DO_REGISTER)
	public UserDtoResponse ajouterTournoi( @RequestBody UserDtoRequest user) {
		user.setPassword(user.getEmail());
		UserDtoResponse tournoiAdd =iUserService.createOrUpdateUser(user);
		return tournoiAdd;
	}
	@PostMapping(Utility.DO_LOGIN)
	public UserDtoResponse getUpdateUser( @RequestBody Login login){
		return iUserService.se_connecter(login.getLogin(), login.getPassword());
    }
	
	@GetMapping(Utility.GET_ALL_USERS)
	public List<UserDtoResponse> getAllUsers( ){
		return iUserService.getAllUsers();
    }
	@DeleteMapping(Utility.DELETE_ALL_USER)
	public boolean deleteUser( @PathVariable(value = "id") Long id){
		return iUserService.deleteUser(id);
    }
}
