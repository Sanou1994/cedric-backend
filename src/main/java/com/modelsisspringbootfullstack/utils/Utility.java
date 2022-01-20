package com.modelsisspringbootfullstack.utils;

import org.modelmapper.ModelMapper;

import com.modelsisspringbootfullstack.dto.request.ProductDtoRequest;
import com.modelsisspringbootfullstack.dto.request.ProductTypeDtoRequest;
import com.modelsisspringbootfullstack.dto.request.RoleDtoRequest;
import com.modelsisspringbootfullstack.dto.request.UserDtoRequest;
import com.modelsisspringbootfullstack.dto.response.ProductDtoResponse;
import com.modelsisspringbootfullstack.dto.response.ProductTypeDtoResponse;
import com.modelsisspringbootfullstack.dto.response.RoleDtoResponse;
import com.modelsisspringbootfullstack.dto.response.UserDtoResponse;
import com.modelsisspringbootfullstack.entities.Product;
import com.modelsisspringbootfullstack.entities.ProductType;
import com.modelsisspringbootfullstack.entities.Role;
import com.modelsisspringbootfullstack.entities.Utilisateur;

public final class Utility {
	// CONSTANT POUR LA SECURITE
		public static final long EXPIRATION_TIME =365 * 24 * 60 * 60 ;
		public static final String TOKEN_PREFIX = "Bearer ";
		public static final String HEADER_STRING = "Authorization";
		public static final String SECRET = "javainuse";
		public static final String NOTREEMAIL ="sanouarouna1994@gmail.com";
		
	
	
	public static final String ADD_PRODUCT = "/products";
	public static final String UPDATE_PRODUCT = "/products";
	public static final String GET_ALL_PRODUCTS = "/products";
	public static final String GET__PRODUCT_BY_ID = "/products/{id}";

	
	public static final String ADD_PRODUCTTYPE = "/productType";
	public static final String GET_ALL_PRODUCTTYPES = "/productTypes";

	public static final String DO_REGISTER = "/user/register";
	public static final String DO_LOGIN = "/user/login";
	public static final String GET_ALL_USERS = "/users";
	public static final String DELETE_ALL_USER = "/users/{id}";

	//LES MAPPERS DTO A DAO USER
		public static  UserDtoResponse utilisateurConvertToUserDtoResponse(Utilisateur utilisateur) {
			ModelMapper modelMapper = new ModelMapper(); 
			UserDtoResponse userDtoResponse = new UserDtoResponse() ;
		    return (utilisateur != null)? modelMapper.map(utilisateur, UserDtoResponse.class) : userDtoResponse;
		}
		
		public static  UserDtoRequest utilisateurConvertToUserDtoRequest(Utilisateur utilisateur) {
			ModelMapper modelMapper = new ModelMapper(); 
			UserDtoRequest userDtoResponse = new UserDtoRequest() ;
		    return (utilisateur != null)? modelMapper.map(utilisateur, UserDtoRequest.class) : userDtoResponse;
		}
		public static  Utilisateur userDtoResponseConvertToUtilisateur(UserDtoResponse userDtoResponse) {
			ModelMapper modelMapper = new ModelMapper(); 
			Utilisateur utilisateur = modelMapper.map(userDtoResponse, Utilisateur.class);
		    return utilisateur;
		}
		public static Utilisateur userDtoRequestConvertToUtilisateur(UserDtoRequest userDtoRequest)  {
			ModelMapper modelMapper = new ModelMapper();
			Utilisateur utilisateur = modelMapper.map(userDtoRequest, Utilisateur.class);
		    return utilisateur;
		}
	
	//LES MAPPERS DTO A DAO ROLE
			public static  RoleDtoResponse roleConvertToRoleDtoResponse(Role role) {
				ModelMapper modelMapper = new ModelMapper(); 
				RoleDtoResponse roleDtoResponse = new RoleDtoResponse() ;
			    return (role != null)? modelMapper.map(role, RoleDtoResponse.class) : roleDtoResponse;
			}
			public static  Role RoleDtoResponseConvertToRole(RoleDtoResponse roleDtoResponse) {
				ModelMapper modelMapper = new ModelMapper(); 
				Role role = modelMapper.map(roleDtoResponse, Role.class);
			    return role;
			}
			public static Role RoleDtoRequestConvertToRole(RoleDtoRequest roleDtoRequest)  {
				ModelMapper modelMapper = new ModelMapper();
				Role role = modelMapper.map(roleDtoRequest, Role.class);
			    return role;
			}

	//LES MAPPERS DTO A DAO PRODUCT
	public static  ProductDtoResponse productConvertToProductDtoResponse( Product   product) {
		ModelMapper modelMapper = new ModelMapper(); 
		ProductDtoResponse  productDtoResponse = new  ProductDtoResponse() ;
	    return ( product != null)? modelMapper.map( product,ProductDtoResponse.class) :  productDtoResponse;
	}
	public static   Product   productDtoResponseConvertToProduct( ProductDtoResponse  productDtoResponse) {
		ModelMapper modelMapper = new ModelMapper(); 
		Product  product = modelMapper.map( productDtoResponse,Product.class);
	    return  product;
	}
	public static  Product   productDtoRequestConvertToProduct(ProductDtoRequest  productDtoRequest)  {
		ModelMapper modelMapper = new ModelMapper();
		Product  product = modelMapper.map( productDtoRequest,  Product.class);
	    return  product;
	}
	
	
	//LES MAPPERS DTO A DAO PRODUCT-TYPE
		public static  ProductTypeDtoResponse productTypeConvertToProductTypeDtoResponse( ProductType   productType) {
			ModelMapper modelMapper = new ModelMapper(); 
			ProductTypeDtoResponse  productTypeDtoResponse = new  ProductTypeDtoResponse() ;
		    return ( productType != null)? modelMapper.map( productType,ProductTypeDtoResponse.class) :  productTypeDtoResponse;
		}
		public static   ProductType   productTypeDtoResponseConvertToProductType( ProductType  productTypeDtoResponse) {
			ModelMapper modelMapper = new ModelMapper(); 
			ProductType  productType = modelMapper.map( productTypeDtoResponse,ProductType.class);
		    return  productType;
		}
		public static  ProductType   productTypeDtoRequestConvertToProductType(ProductTypeDtoRequest  productTypeDtoRequest)  {
			ModelMapper modelMapper = new ModelMapper();
			ProductType  productType = modelMapper.map( productTypeDtoRequest,  ProductType.class);
		    return  productType;
		}
	
	
	
}
