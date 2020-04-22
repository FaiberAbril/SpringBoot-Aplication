package com.hargez.springbootapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hargez.springbootapp.Models.RolModel;

public interface IRolRepository extends JpaRepository<RolModel, Integer>{

}
