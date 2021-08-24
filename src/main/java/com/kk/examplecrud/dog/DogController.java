package com.kk.examplecrud.dog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public List<Dog> getAllDogs(){
        return dogService.getAllDogs();
    }

    @GetMapping("/dogs/{id}")
    public Dog getDog(@PathVariable Long id) {
        return dogService.getDog(id);
    }

	@PostMapping("/dogs")
	public void addDog(@RequestBody Dog dog) {
		dogService.addDog(dog);
	}
	
	@PutMapping("/dogs/{id}")
	public void updateDog(@PathVariable Long id, @RequestBody Dog dog) {
		dogService.updateDog(id, dog);
	}
	
	@DeleteMapping("/dogs/{id}")
	public void deleteDog(@PathVariable Long id) {
		dogService.deleteDog(id);
	}	
}
