package com.pg.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pg.demo.entity.Pg;

public interface PgRepo extends JpaRepository<Pg, Long> {
	
}
