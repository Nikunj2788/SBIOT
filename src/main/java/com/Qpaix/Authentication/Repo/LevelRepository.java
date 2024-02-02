package com.Qpaix.Authentication.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Level;


@Repository
public interface LevelRepository extends JpaRepository<Level, Long> {

}
