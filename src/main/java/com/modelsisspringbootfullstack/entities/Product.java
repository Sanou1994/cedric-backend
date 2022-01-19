package com.modelsisspringbootfullstack.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Product {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private Date dateCreated;
private String type;
@ManyToMany(targetEntity=Utilisateur.class, mappedBy="products")
private List<Utilisateur> users = new ArrayList<Utilisateur>();

public Product(String name, Date dateCreated, String type,List<Utilisateur> users) {
	super();
	this.name = name;
	this.dateCreated = dateCreated;
	this.type = type;
	this.users = users;

}

}
