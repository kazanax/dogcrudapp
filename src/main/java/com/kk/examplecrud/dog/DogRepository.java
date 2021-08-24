package com.kk.examplecrud.dog;
import org.springframework.data.repository.CrudRepository;



public interface DogRepository extends CrudRepository<Dog, Long> {
    
}




