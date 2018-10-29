package com.micro.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.micro.dto.SwaggerDTO;
import com.micro.service.SwaggerModuleService;

@RestController
@RequestMapping("swaggerService")
public class SwaggerModuleController {
	
	private static final Log LOG=LogFactory.getLog(SwaggerModuleController.class);
	
	@Autowired
	private SwaggerModuleService swaggerModuleService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<SwaggerDTO>createSwagger(@RequestBody SwaggerDTO dto){
		LOG.info("In side SwaggerModuleController :::[createSwagger]");
		try {
		 swaggerModuleService.addSwaggerModuleService(dto);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
