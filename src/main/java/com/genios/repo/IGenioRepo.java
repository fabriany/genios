package com.genios.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.genios.entitys.Genio;

@Repository
public interface IGenioRepo extends JpaRepository<Genio, Integer> {

}
