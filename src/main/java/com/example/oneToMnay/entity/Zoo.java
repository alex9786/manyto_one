package com.example.oneToMnay.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Zoo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
   // @Column(name="zooId")
	private int no;
	
	private String zooName;
	
	private int price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="a.id")
	@JsonBackReference
	private Animal animal;
	
	

}
