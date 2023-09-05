package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BeamsRoadCategoryDetails;

@Repository
public interface BeamsRoadCategoryDetailsRpository extends JpaRepository<BeamsRoadCategoryDetails, Integer> {

}
