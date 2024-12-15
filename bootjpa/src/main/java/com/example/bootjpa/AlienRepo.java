package com.example.bootjpa;

import com.example.bootjpa.model.Alien;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    List<Alien> findByLang(String lang);
}
