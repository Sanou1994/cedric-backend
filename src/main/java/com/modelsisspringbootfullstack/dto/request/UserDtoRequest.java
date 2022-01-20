package com.modelsisspringbootfullstack.dto.request;

import java.util.ArrayList;
import java.util.List;

import com.modelsisspringbootfullstack.entities.Product;
import com.modelsisspringbootfullstack.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class UserDtoRequest {
	private String username;
	private String email;
	private String login;
	private String password;
	List<Role> roles;
	private List<Product> products = new ArrayList<Product>();
}
