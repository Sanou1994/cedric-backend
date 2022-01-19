package com.modelsisspringbootfullstack.iservice;

import java.util.List;

import com.modelsisspringbootfullstack.dto.request.RoleDtoRequest;
import com.modelsisspringbootfullstack.dto.response.RoleDtoResponse;

public interface IRoleService {
	//MANAGER Role
	  public RoleDtoResponse createOrUpdateRole( RoleDtoRequest RoleDtoRequest);
	  public List<RoleDtoResponse> getAllRoles();
}
