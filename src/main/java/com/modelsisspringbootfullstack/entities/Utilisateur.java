package com.modelsisspringbootfullstack.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Utilisateur {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String email;
	private String login;
	private String password;
	@OneToMany(targetEntity=Role.class, mappedBy="user")
	private List<Role> roles = new ArrayList<Role>();;
	@ManyToMany(targetEntity=Product.class,cascade = CascadeType.ALL)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Product> products = new ArrayList<Product>();
	public Utilisateur(String username,String email, String login, String password, List<Role> roles,List<Product> products) {
		super();
		this.username = username;
		this.email = email;
		this.login = login;
		this.password = password;
		this.roles = roles;
		this.products = products;
	}
	public boolean removeProduct(Product product) {
		this.products.remove(product);
		return true;
	}
	public List<Product> addProduct(Product product) {
		this.products.add(product);
		return this.products;
	}
	
}
