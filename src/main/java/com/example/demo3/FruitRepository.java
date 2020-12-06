package com.example.demo3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface FruitRepository extends CrudRepository<Fruit, Integer> {
	
	List<Fruit> findByName(String name);

}
