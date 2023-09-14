package com.registry.resource;

import com.registry.avro.RecordPoc;
import com.registry.dto.BusinessRuleDTO;
import com.registry.dto.RecDTO;
import com.registry.service.BusinessRuleService;
import com.registry.service.RecService;
import org.apache.jute.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/rec")
public class RecController {
	
	@Autowired
	private RecService re;
	
	@PostMapping
	public ResponseEntity<RecDTO> postProduct (@Valid @RequestBody RecDTO recordPoc){

		re.send(recordPoc);
		
		return ResponseEntity.ok(recordPoc);
	}

}
