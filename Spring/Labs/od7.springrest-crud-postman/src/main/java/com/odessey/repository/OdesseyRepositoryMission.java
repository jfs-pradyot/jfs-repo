package com.odessey.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
@Repository
public interface OdesseyRepositoryMission extends JpaRepository<Mission, String> {

}
