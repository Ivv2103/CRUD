package com.ivv.demo.interfaceService;
import java.util.List;
import java.util.Optional;
import com.ivv.demo.modelo.Producto;

public interface IProductoService {
public List<Producto>listar();
public Optional <Producto>listarId(long id);
public int save (Producto p);
public void delete (long id);

}
