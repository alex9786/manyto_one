package com.example.oneToMnay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.oneToMnay.entity.Zoo;

public interface ZooRepository extends JpaRepository<Zoo, Integer>{

}
