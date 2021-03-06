package com.kk.examplecrud.dog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Dog {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    public Dog() {
    }
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [age=" + age + ", id=" + id + ", name=" + name + "]";
    }

    
}
