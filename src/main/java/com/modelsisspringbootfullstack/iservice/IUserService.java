package com.modelsisspringbootfullstack.iservice;

import java.util.List;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;

public interface IUserService {
	//MANAGER User
	  public UserDtoResponse se_connecter(String username,String password);
	  public UserDtoResponse login_up(UserDtoRequest user);
	  public UserDtoResponse createOrUpdateUser( UserDtoRequest userDtoRequest);
	  public List<UserDtoResponse> getAllUsers();
	  public boolean deleteUser(Long id);
	  public List<UserDtoResponse> addProduct(ProductDtoRequest productDtoRequest);
}
