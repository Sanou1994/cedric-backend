package com.modelsisspringbootfullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelsisspringbootfullstack.entities.ProductType;

public interface ProductTypeRepository extends JpaRepository<ProductType, Long>{

}
