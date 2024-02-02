  package com.Qpaix.Authentication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Qpaix.Authentication.Entity.Flow;


@Repository
public interface FlowRepository extends JpaRepository<Flow , Long> {

}
