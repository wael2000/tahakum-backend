package com.example.demo3;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;



@RestController
@EnableAutoConfiguration
public class FruitsController {
	
	@Autowired FruitRepository repository;
	
	@GetMapping("/api/fruits")
    public Iterable<Fruit> getAll() {
        return repository.findAll();
    }
	
	
	@GetMapping("/api/fruit")
	public List<Fruit> getFruitByName(@RequestParam(value = "name") String name) {
		return  repository.findByName(name);
	}
	    
}
