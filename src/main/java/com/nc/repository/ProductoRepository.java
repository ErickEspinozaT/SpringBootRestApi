package com.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.entity.Productos;

public interface ProductoRepository extends JpaRepository<Productos, Integer> {}
