package com.acadproyect.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acadproyect.springboot.app.models.entity.Rol;


public interface RolRepository extends JpaRepository<Rol, Long> {

	Rol findByNombre(String nombre);
}
