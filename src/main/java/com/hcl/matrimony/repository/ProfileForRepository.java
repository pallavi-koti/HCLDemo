package com.hcl.matrimony.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.matrimony.model.ProfileFor;

@Transactional
public interface ProfileForRepository  extends JpaRepository<ProfileFor, Long> {

}
