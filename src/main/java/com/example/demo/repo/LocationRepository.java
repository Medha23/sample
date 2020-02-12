package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LocationEntity;

public interface LocationRepository extends JpaRepository<LocationEntity, Long>{

}
