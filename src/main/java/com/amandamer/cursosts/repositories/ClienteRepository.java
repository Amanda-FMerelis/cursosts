package com.amandamer.cursosts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandamer.cursosts.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

}
