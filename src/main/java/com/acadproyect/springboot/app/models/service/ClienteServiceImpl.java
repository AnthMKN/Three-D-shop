package com.acadproyect.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acadproyect.springboot.app.models.dao.IClienteDao;
import com.acadproyect.springboot.app.models.dao.IFacturaDao;
import com.acadproyect.springboot.app.models.dao.IProductoDao;
import com.acadproyect.springboot.app.models.entity.Cliente;
import com.acadproyect.springboot.app.models.entity.Factura;
import com.acadproyect.springboot.app.models.entity.Producto;



@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente cliente) {
		clienteDao.save(cliente);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findOne(Long id) {
		// TODO Auto-generated method stub
		return (Cliente)(clienteDao.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}
	

	@Override
	@Transactional(readOnly =true)
	public Page<Cliente> findAll(Pageable pageable) {
		
		return clienteDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly =true)
	public List<Producto> findByNombre(String term) {
		
		return productoDao.findByNombre(term);
	}

	@Override
	@Transactional
	public void saveFactura(Factura factura) {
		
		facturaDao.save(factura);
	}

	@Override
	@Transactional(readOnly =true)
	public Producto findProductoById(Long id) {
		
		return (Producto) productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly =true)
	public Factura findFacturaById(Long id) {
		
		return facturaDao.findById(id).orElse(null);	
	}
	
	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAllProducts(Pageable pageable) {
		
		return productoDao.findAll(pageable);
	}

	@Override
	public void saveProducto(Producto producto) {
		
		productoDao.save(producto);
	}

	@Override
	public Producto findOneProduct(Long id) {
		
		return (Producto) productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findByEmail(String email) {
	    return clienteDao.findByEmail(email);
	}
	
}
