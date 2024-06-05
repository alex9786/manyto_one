package com.example.oneToMnay.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.oneToMnay.entity.Animal;
import com.example.oneToMnay.service.AnimalService;

@RestController
@RequestMapping("/animalApi")
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
	@PostMapping("/post")
	public Animal postOne(@RequestBody Animal animal) {
		return animalService.postAnimal(animal); 
	}
	
	@GetMapping("/get/{id}")
	public Optional<Animal> getAnimal(@PathVariable ("id") int id){
		return animalService.getAniaml(id);
	}
	
	@PutMapping("/update")
	public Animal update(@RequestBody Animal changeAnimal) {
		return animalService.update(changeAnimal);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return animalService.delete(id);
	}
	
	
	
}
