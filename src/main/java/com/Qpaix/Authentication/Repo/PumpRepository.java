package com.Qpaix.Authentication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Qpaix.Authentication.Entity.Pump;


@Repository
public interface PumpRepository extends JpaRepository<Pump, Long> {

}
