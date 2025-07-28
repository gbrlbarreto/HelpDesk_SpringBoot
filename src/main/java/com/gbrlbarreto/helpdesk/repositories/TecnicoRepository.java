package com.gbrlbarreto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbrlbarreto.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
    
}
