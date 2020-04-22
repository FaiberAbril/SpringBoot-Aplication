package com.hargez.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hargez.springbootapp.Models.RolModel;

@Repository
public interface IRolRepository extends JpaRepository<RolModel, Integer>{

}
