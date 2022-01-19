package com.modelsisspringbootfullstack.dto.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
public class ProductDtoResponse {
	    private Long id;
		private String name;
		private String type;
		private Date dateCreated;

	}

