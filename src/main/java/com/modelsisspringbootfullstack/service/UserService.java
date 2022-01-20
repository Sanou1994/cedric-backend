package com.modelsisspringbootfullstack.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;
import com.modelsisspringbootfullstack.entities.Utilisateur;
import com.modelsisspringbootfullstack.iservice.IUserService;
import com.modelsisspringbootfullstack.repository.UserRepository;
import com.modelsisspringbootfullstack.utils.Utility;
@Service @Transactional
public class UserService implements IUserService{
	@Autowired
    private UserRepository userRepository;
	
	@Override
	public UserDtoResponse createOrUpdateUser(UserDtoRequest userDtoRequest) {
		UserDtoResponse userDtoResponse = null;
		try {
			Utilisateur user = Utility.userDtoRequestConvertToUtilisateur(userDtoRequest);
			userDtoResponse = Utility.utilisateurConvertToUserDtoResponse(userRepository.save(user));
				
		} catch (Exception e) {
			userDtoResponse = new UserDtoResponse();
		}
		return userDtoResponse;
	}


	@Override
	public List<UserDtoResponse> getAllUsers() {
		List<Utilisateur> Users =userRepository.findAll();
		 List<UserDtoResponse> UserDtoResponses = Users.stream()
				 .map(user -> Utility.utilisateurConvertToUserDtoResponse(user)).collect(Collectors.toList());
		return UserDtoResponses;
	}


	@Override
	public List<UserDtoResponse> addProduct(ProductDtoRequest productDtoRequest) {
		
		return null;
	}


	@Override
	public UserDtoResponse se_connecter(String username, String password) {
		UserDtoResponse userMap = null;
		Utilisateur user = userRepository.findByEmail(username);
			if(user != null){
				userMap = Utility.utilisateurConvertToUserDtoResponse(user);
			}	
		return userMap ;
	}


	@Override
	public UserDtoResponse login_up(UserDtoRequest user) {
		Utilisateur userGot = userRepository.findByEmail(user.getEmail());
		UserDtoResponse userMap =null;
		if(userGot == null) {
			Utilisateur userConverted =Utility.userDtoRequestConvertToUtilisateur(user);
			Utilisateur userSave = userRepository.save(userConverted);
			userMap = Utility.utilisateurConvertToUserDtoResponse(userSave);
		}else {
			userMap = new UserDtoResponse();
		}
		return userMap ;
	}


	@Override
	public boolean deleteUser(Long id) {
		boolean resultat =false;
		try {
			Utilisateur userSave = userRepository.findById(id).get();
			userRepository.delete(userSave);
			resultat=true;
		} catch (Exception e) {
			resultat=false;
		}
		return resultat;
	}
}
