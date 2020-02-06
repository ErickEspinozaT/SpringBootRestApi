package com.nc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nc.entity.Orders;


public interface OrderRepository extends JpaRepository<Orders, Integer> {
}
