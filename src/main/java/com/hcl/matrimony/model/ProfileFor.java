package com.hcl.matrimony.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PROFILE_FOR")
@EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
@Cacheable
public class ProfileFor implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID", unique = true, nullable = false)
    private Long id;
    
    @Column(name="NAME", unique = false, nullable = false)
    private String name;
    
    @Column(name="DESCRIPTION", unique = false, nullable = false)
    private String description;
}
