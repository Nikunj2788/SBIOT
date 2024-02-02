package com.Qpaix.Authentication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Qpaix.Authentication.Entity.TDSAndPHCount;


@Repository
public interface TDSAndPHCountRepository extends JpaRepository<TDSAndPHCount, Long> {

}
