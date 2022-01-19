package com.modelsisspringbootfullstack.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductDtoResponse;
import com.modelsisspringbootfullstack.entities.Product;
import com.modelsisspringbootfullstack.iservice.IProductService;
import com.modelsisspringbootfullstack.repository.ProductRepository;
import com.modelsisspringbootfullstack.utils.Utility;
@Service @Transactional
public class ProductService implements IProductService{
	@Autowired
    private ProductRepository productRepository;
	
	@Override
	public ProductDtoResponse createOrUpdateProduct(ProductDtoRequest productDtoRequest) {
		ProductDtoResponse productDtoResponse = null;
		try {
			Product product = Utility.productDtoRequestConvertToProduct(productDtoRequest);
			productDtoResponse = Utility.productConvertToProductDtoResponse(productRepository.save(product));
				
		} catch (Exception e) {
			productDtoResponse = new ProductDtoResponse();
		}
		return productDtoResponse;
	}


	@Override
	public List<ProductDtoResponse> getAllProducts() {
		List<Product> products =productRepository.findAll();
		 List<ProductDtoResponse> productDtoResponses = products.stream()
				 .map(product -> Utility.productConvertToProductDtoResponse(product)).collect(Collectors.toList());
		return productDtoResponses;
	}

}
