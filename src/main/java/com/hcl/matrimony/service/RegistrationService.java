package com.hcl.matrimony.service;

import static org.mockito.Mockito.description;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.matrimony.dto.DictionaryDTO;
import com.hcl.matrimony.model.ProfileFor;
import com.hcl.matrimony.repository.ProfileForRepository;

@Service
public class RegistrationService {

	@Autowired
	private ProfileForRepository profileForRepository;
	
	public List<DictionaryDTO> getProfilesFor() {
		List<DictionaryDTO> returnList = new ArrayList<DictionaryDTO>();
		
		List<ProfileFor> profileForList  = profileForRepository.findAll();
		if(CollectionUtils.isNotEmpty(profileForList)) {
			profileForList.stream().forEach((profileFor) -> {
				returnList.add(DictionaryDTO.builder()
				.id(profileFor.getId())
				.name(profileFor.getName())
				.description(profileFor.getDescription())
				.build());
				
			});
		}
		
		return returnList;
	}
}
