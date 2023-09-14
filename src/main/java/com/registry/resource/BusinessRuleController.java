package com.registry.resource;

import com.registry.dto.BusinessRuleDTO;
import com.registry.dto.ProductDTO;
import com.registry.service.BusinessRuleService;
import com.registry.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/business")
public class BusinessRuleController {
	
	@Autowired
	private BusinessRuleService businessRuleService;
	
	@PostMapping
	public ResponseEntity<BusinessRuleDTO> postProduct (@Valid @RequestBody BusinessRuleDTO businessRuleDTO){

		businessRuleService.send(businessRuleDTO);
		
		return ResponseEntity.ok(businessRuleDTO);
	}

}
