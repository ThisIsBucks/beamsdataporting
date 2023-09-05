package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BeamsWorksMaster;

@Repository
public interface BeamsWorksMasterRepository extends JpaRepository<BeamsWorksMaster, Integer> {

}
