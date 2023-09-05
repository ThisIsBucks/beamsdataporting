package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BeamsSchemeDetails;

@Repository
public interface BeamsSchemeDetailsRepository extends JpaRepository<BeamsSchemeDetails, Integer>  {

}
