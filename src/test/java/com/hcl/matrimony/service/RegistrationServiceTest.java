package com.hcl.matrimony.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.matrimony.repository.ProfileForRepository;

@RunWith(MockitoJUnitRunner.class)
class RegistrationServiceTest {

	@Mock
	private RegistrationService registrationService;
	
	@Mock
	private ProfileForRepository profileForRepository;
	
	@Test
	public void testGetProfilesFor() {
		registrationService.getProfilesFor();
	}

}
