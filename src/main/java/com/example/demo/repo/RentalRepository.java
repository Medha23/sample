package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RentalEntity;

public interface RentalRepository extends JpaRepository<RentalEntity, Long>{

}
