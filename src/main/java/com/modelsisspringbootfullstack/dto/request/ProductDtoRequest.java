package com.modelsisspringbootfullstack.dto.request;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductDtoRequest {
	private String name;
	private String type;
	private Date dateCreated;
}
