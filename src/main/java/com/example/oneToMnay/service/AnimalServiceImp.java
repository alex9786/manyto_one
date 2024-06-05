package com.example.oneToMnay.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.oneToMnay.entity.Animal;
import com.example.oneToMnay.repository.AnimalRepository;
import com.example.oneToMnay.repository.ZooRepository;

@Service
public class AnimalServiceImp implements AnimalService {

	@Autowired
	AnimalRepository animalRepo;
	
	@Autowired
	ZooRepository zooRepo;
	@Override
	public Animal postAnimal(Animal animal) {
		return animalRepo.save(animal);
	}

	@Override
	public Optional<Animal> getAniaml(int id) {	
		return animalRepo.findById(id);
	}

	@Override
	public Animal update(Animal changeAnimal) {
	Optional<Animal> animal1=animalRepo.findById(changeAnimal.getId());
	Animal animal2= animal1.get();
	animal2.setId(changeAnimal.getId());
	animal2.setName(changeAnimal.getName());
	animal2.setTotal(changeAnimal.getTotal());
	animal2.setZoo(changeAnimal.getZoo());
		return animalRepo.save(changeAnimal);
	}

	@Override
	public String delete(int id) {
		animalRepo.deleteById(id);
		return "deleted success";
	}
	
	
	
	
	
	
	
}
