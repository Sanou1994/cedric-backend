package com.modelsisspringbootfullstack.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelsisspringbootfullstack.dto.request.RoleDtoRequest;
import com.modelsisspringbootfullstack.dto.response.RoleDtoResponse;
import com.modelsisspringbootfullstack.entities.Role;
import com.modelsisspringbootfullstack.iservice.IRoleService;
import com.modelsisspringbootfullstack.repository.RoleRepository;
import com.modelsisspringbootfullstack.utils.Utility;
@Service @Transactional
public class RoleService implements IRoleService{
	@Autowired
    private RoleRepository roleRepository;
	
	@Override
	public RoleDtoResponse createOrUpdateRole(RoleDtoRequest roleDtoRequest) {
		RoleDtoResponse roleDtoResponse = null;
		try {
			Role role = Utility.RoleDtoRequestConvertToRole(roleDtoRequest);
			roleDtoResponse = Utility.roleConvertToRoleDtoResponse(roleRepository.save(role));
				
		} catch (Exception e) {
			roleDtoResponse = new RoleDtoResponse();
		}
		return roleDtoResponse;
	}


	@Override
	public List<RoleDtoResponse> getAllRoles() {
		List<Role> roles = roleRepository.findAll();
		 List<RoleDtoResponse> roleDtoResponses =roles.stream()
				 .map(role -> Utility.roleConvertToRoleDtoResponse(role)).collect(Collectors.toList());
		return roleDtoResponses;
	}

}
