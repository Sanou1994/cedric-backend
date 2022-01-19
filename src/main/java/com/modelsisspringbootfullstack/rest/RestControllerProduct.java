package com.modelsisspringbootfullstack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductDtoResponse;
import com.modelsisspringbootfullstack.iservice.IProductService;
import com.modelsisspringbootfullstack.utils.Utility;

@RestController
public class RestControllerProduct {
	@Autowired
	private IProductService iProductService;
	@PostMapping(Utility.ADD_PRODUCT)
	public ProductDtoResponse ajouterTournoi( @RequestBody ProductDtoRequest tournoi) {
		ProductDtoResponse tournoiAdd =iProductService.createOrUpdateProduct(tournoi);
		return tournoiAdd;
	}
	@PutMapping(Utility.UPDATE_PRODUCT)
	public ProductDtoResponse getUpdateUser( @RequestBody ProductDtoRequest productDtoRequest){
		return iProductService.createOrUpdateProduct(productDtoRequest);
    }
	@GetMapping(Utility.GET_ALL_PRODUCTS)
	public List<ProductDtoResponse> getAllTournoi(){
		return iProductService.getAllProducts();
    }
	
}
