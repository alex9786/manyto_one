package com.example.oneToMnay.service;

import java.util.Optional;

import com.example.oneToMnay.entity.Animal;

public interface AnimalService {

	Animal postAnimal(Animal animal);

	Optional<Animal> getAniaml(int id);

	Animal update(Animal changeAnimal);

	String delete(int id);

}
