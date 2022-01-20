package com.modelsisspringbootfullstack.dto.response;

import java.util.ArrayList;
import java.util.List;

import com.modelsisspringbootfullstack.entities.Product;
import com.modelsisspringbootfullstack.entities.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class UserDtoResponse {
	private Long id;
	private String username;
	private String email;
	private String login;
	private String password;
	List<Role> roles;
	private List<Product> products = new ArrayList<Product>();
}
