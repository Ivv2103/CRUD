package com.ivv.demo.interfaces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ivv.demo.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository <Producto, Long>{

}
