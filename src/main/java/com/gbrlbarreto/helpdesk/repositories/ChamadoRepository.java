package com.gbrlbarreto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbrlbarreto.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
    
}
