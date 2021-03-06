package com.amandamer.cursosts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amandamer.cursosts.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {

}
