package com.odessey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odessey.model.Astronaut;

@Repository
public interface OdesseyRepositoryAstronaut extends JpaRepository<Astronaut, Integer> {

}
