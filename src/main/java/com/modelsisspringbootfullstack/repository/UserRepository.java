package com.modelsisspringbootfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.modelsisspringbootfullstack.entities.Utilisateur;

public interface UserRepository extends JpaRepository<Utilisateur, Long>{
	public Utilisateur findByUsername(String username);
    public Utilisateur findByEmail(String email);
}
