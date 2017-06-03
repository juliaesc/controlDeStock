package ar.com.buildingways.controlDeStock.dao;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.Producto;

public interface ProductoDao {
	
	Producto findById(int id);
     
    void save(Producto producto);
     
    void delete(int id);
     
    List<Producto> findAllProductos();

}
