package com.modelsisspringbootfullstack.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelsisspringbootfullstack.dto.request.ProductTypeDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductTypeDtoResponse;
import com.modelsisspringbootfullstack.entities.ProductType;
import com.modelsisspringbootfullstack.iservice.IProductTypeService;
import com.modelsisspringbootfullstack.repository.ProductTypeRepository;
import com.modelsisspringbootfullstack.utils.Utility;
@Service @Transactional
public class ProductTypeService implements IProductTypeService{
	@Autowired
    private ProductTypeRepository productRepository;
	
	@Override
	public ProductTypeDtoResponse createOrUpdateProductType(ProductTypeDtoRequest productTypeDtoRequest) {
		ProductTypeDtoResponse productTypeDtoResponse = null;
		try {
			ProductType product = Utility.productTypeDtoRequestConvertToProductType(productTypeDtoRequest);
			productTypeDtoResponse = Utility.productTypeConvertToProductTypeDtoResponse(productRepository.save(product));
				
		} catch (Exception e) {
			productTypeDtoResponse = new ProductTypeDtoResponse();
		}
		return productTypeDtoResponse;
	}


	@Override
	public List<ProductTypeDtoResponse> getAllProductTypes() {
		List<ProductType> productTypes =productRepository.findAll();
		 List<ProductTypeDtoResponse> productTypeDtoResponses = productTypes.stream()
				 .map(productType -> Utility.productTypeConvertToProductTypeDtoResponse(productType)).collect(Collectors.toList());
		return productTypeDtoResponses;
	}

}
