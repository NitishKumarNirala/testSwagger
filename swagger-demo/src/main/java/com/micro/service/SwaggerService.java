package com.micro.service;

import java.util.List;

import com.micro.dto.SwaggerDTO;

public interface SwaggerService {
	
	public void addRequest(SwaggerDTO dto);
	
	public List<SwaggerDTO>listData();

}
