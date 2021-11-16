package com.ivv.demo.servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivv.demo.interfaceService.IProductoService;
import com.ivv.demo.modelo.Producto;
import com.ivv.demo.interfaces.IProducto;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;
	@Override
	public List<Producto> listar() {
		
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(long id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Producto p) {
		int res=0;
		Producto producto=data.save(p);
		if(!producto.equals(null)){
		res=1;
		}
			return res;
		}
	
	@Override
	public void delete(long id) {
		data.deleteById(id);
		
	}

}
