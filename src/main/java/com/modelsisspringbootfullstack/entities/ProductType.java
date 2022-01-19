package com.modelsisspringbootfullstack.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class ProductType {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
public ProductType(String name) {
	super();
	this.name = name;
}

}
