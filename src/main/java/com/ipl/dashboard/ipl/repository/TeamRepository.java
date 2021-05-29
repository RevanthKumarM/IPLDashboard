package com.ipl.dashboard.ipl.repository;

import com.ipl.dashboard.ipl.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
    
}
