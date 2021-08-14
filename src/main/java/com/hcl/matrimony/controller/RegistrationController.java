package com.hcl.matrimony.controller;

import java.lang.annotation.Annotation;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.matrimony.dto.DictionaryDTO;
import com.hcl.matrimony.model.ProfileFor;
import com.hcl.matrimony.service.RegistrationService;

 
@RestController
@RequestMapping("/v1")
public class RegistrationController
{
	
	private RegistrationService registrationService;

	@Autowired
	public RegistrationController(RegistrationService registrationService) {
		this.registrationService = registrationService;
	}
	
	@RequestMapping(value="/profilesFor", method = RequestMethod.GET)
	public ResponseEntity<Object>  getProfilesFor()
	{
		List<DictionaryDTO> returnList = null;
		try {
			returnList = registrationService.getProfilesFor();
			if(CollectionUtils.isEmpty(returnList)) {
				return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No Data Found");
			}
		} catch(Exception exp) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exp.getMessage());
		}
		return ResponseEntity.status(HttpStatus.OK).body(returnList);
	}
   
	

}