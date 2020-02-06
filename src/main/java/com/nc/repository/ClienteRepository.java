package com.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.entity.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Integer> {

}
