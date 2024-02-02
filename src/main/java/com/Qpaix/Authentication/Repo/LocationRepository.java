package com.Qpaix.Authentication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Qpaix.Authentication.Entity.LocationMaster;


@Repository
public interface LocationRepository extends JpaRepository<LocationMaster, Long> {

}
