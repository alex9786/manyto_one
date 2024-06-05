package com.example.oneToMnay.entity;

import org.hibernate.mapping.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="animalDetail")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private  int id;
	
	@Column(name="animalName")
	private String name;
	
	@Column(name="totalCount")
	private int total;

	
//	@OneToMany(cascade =CascadeType.ALL)
//	@JoinColumn(name="fk_no",referencedColumnName = "id")
//	private java.util.List<Zoo> zoo;
	
	@OneToMany(mappedBy = "animal",cascade =CascadeType.ALL )
	@JsonManagedReference
	private java.util.List<Zoo> zoo;
	
	
	
	
	
	
}
