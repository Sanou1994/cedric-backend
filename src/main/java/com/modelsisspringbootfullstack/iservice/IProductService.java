package com.modelsisspringbootfullstack.iservice;

import java.util.List;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductDtoResponse;

public interface IProductService {
	//MANAGER PRODUCT
	  public ProductDtoResponse createOrUpdateProduct( ProductDtoRequest ProductDtoRequest);
	  public List<ProductDtoResponse> getAllProducts();
}
