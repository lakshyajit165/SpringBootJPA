package com.stackroute.SpringBootJPA.dao;

import com.stackroute.SpringBootJPA.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {


}
