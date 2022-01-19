package com.modelsisspringbootfullstack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;
import com.modelsisspringbootfullstack.iservice.IUserService;
import com.modelsisspringbootfullstack.utils.Utility;

@RestController
public class RestControllerUser {
	@Autowired
	private IUserService iUserService;
	@PostMapping(Utility.DO_REGISTER)
	public UserDtoResponse ajouterTournoi( @RequestBody UserDtoRequest tournoi) {
		UserDtoResponse tournoiAdd =iUserService.createOrUpdateUser(tournoi);
		return tournoiAdd;
	}
	@PutMapping(Utility.DO_LOGIN)
	public UserDtoResponse getUpdateUser( @RequestBody UserDtoRequest UserDtoRequest){
		return iUserService.createOrUpdateUser(UserDtoRequest);
    }
}