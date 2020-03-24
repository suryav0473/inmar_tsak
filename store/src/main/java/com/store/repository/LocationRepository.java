package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
