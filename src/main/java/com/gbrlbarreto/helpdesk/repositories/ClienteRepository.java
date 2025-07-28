package com.gbrlbarreto.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbrlbarreto.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
}
