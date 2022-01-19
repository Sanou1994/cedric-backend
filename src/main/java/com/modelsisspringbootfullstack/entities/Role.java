package com.modelsisspringbootfullstack.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Entity @AllArgsConstructor @NoArgsConstructor
public class Role {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String libelle;
@ManyToOne
private Utilisateur user ;
public Role(String libelle) {
	super();
	this.libelle = libelle;
}

}
