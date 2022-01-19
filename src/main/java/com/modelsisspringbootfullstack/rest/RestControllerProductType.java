package com.modelsisspringbootfullstack.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelsisspringbootfullstack.dto.request.ProductTypeDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductTypeDtoResponse;
import com.modelsisspringbootfullstack.iservice.IProductTypeService;
import com.modelsisspringbootfullstack.utils.Utility;

@RestController
public class RestControllerProductType {
	@Autowired
	private IProductTypeService iProductTypeService;
	
	@PostMapping(Utility.ADD_PRODUCTTYPE)
	public ProductTypeDtoResponse ajouterProductType( @RequestBody ProductTypeDtoRequest productTypeDtoRequest) {
		ProductTypeDtoResponse productTypeAdd =iProductTypeService.createOrUpdateProductType(productTypeDtoRequest);
		return productTypeAdd;
	}
	
	@GetMapping(Utility.GET_ALL_PRODUCTTYPES)
	public List<ProductTypeDtoResponse> getAllProductTypes(){
		return iProductTypeService.getAllProductTypes();
    }
	
}
