package com.acadproyect.springboot.app.models.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.acadproyect.springboot.app.models.entity.Producto;



public interface IProductoDao extends PagingAndSortingRepository<Producto, Long> {

	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);
	
	List<Producto> findAll();

	void save(Producto producto);

	Optional <Object> findById(Long id);

	void deleteById(Long id);

}
