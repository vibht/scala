package com.server.application.scala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.application.scala.entity.UserserviceModel;

@Repository
public interface UserserviceRepository extends JpaRepository<UserserviceModel,String> {
    
}
