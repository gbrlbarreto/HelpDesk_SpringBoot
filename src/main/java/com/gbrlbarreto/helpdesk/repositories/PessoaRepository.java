package com.gbrlbarreto.helpdesk.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbrlbarreto.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
    Optional<Pessoa> findByCpf(String cpf);
    Optional<Pessoa> findByEmail(String email);
}
