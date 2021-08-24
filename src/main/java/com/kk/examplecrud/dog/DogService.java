package com.kk.examplecrud.dog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DogService {

    @Autowired
    private DogRepository dogRepository;

    public List<Dog> getAllDogs() {
        List<Dog> dogs = new ArrayList<>(); 
        dogRepository.findAll().forEach(dogs::add);
        return dogs;
    }

    public Dog getDog(Long id) {
        Dog dog = dogRepository
            .findById(id)
            .get();
            
        return dog;
    }

    public void addDog(Dog newDog){
        dogRepository.save(newDog);
    }

    public void updateDog(Long id, Dog newDog) {
        Dog dog = dogRepository.findById(id).get();
        dog.setName(newDog.getName());
        dog.setAge(newDog.getAge());
        dogRepository.save(dog); 
    }

    public void deleteDog(Long id) {
        dogRepository.deleteById(id);
    }
}
