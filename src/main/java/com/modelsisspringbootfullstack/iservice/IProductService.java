package com.modelsisspringbootfullstack.iservice;

import java.util.List;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductDtoResponse;

public interface IProductService {
	//MANAGER PRODUCT
	  public ProductDtoResponse createProduct( ProductDtoRequest ProductDtoRequest);
	  public ProductDtoResponse updateProduct( ProductDtoResponse productDtoResponse);
	  public List<ProductDtoResponse> getAllProducts();
	  public ProductDtoResponse getProductById(Long id);

}
