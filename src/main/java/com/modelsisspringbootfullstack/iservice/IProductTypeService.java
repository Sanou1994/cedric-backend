package com.modelsisspringbootfullstack.iservice;

import java.util.List;

import com.modelsisspringbootfullstack.dto.request.ProductTypeDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductTypeDtoResponse;
public interface IProductTypeService {
	//MANAGER ProductType
	  public ProductTypeDtoResponse createOrUpdateProductType( ProductTypeDtoRequest ProductTypeDtoRequest);
	  public List<ProductTypeDtoResponse> getAllProductTypes();
}
