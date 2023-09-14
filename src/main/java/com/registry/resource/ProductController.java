package com.registry.resource;

import com.registry.dto.ProductDTO;
import com.registry.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public ResponseEntity<ProductDTO> postProduct (@Valid @RequestBody ProductDTO productDTO){

		productService.send(productDTO);
		
		return ResponseEntity.ok(productDTO);
	}

}
