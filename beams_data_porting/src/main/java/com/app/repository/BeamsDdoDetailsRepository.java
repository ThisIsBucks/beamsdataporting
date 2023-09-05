package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BeamsDdoDetails;


@Repository
public interface BeamsDdoDetailsRepository extends JpaRepository<BeamsDdoDetails, Integer>{

}
