package ar.com.buildingways.controlDeStock.service;

import java.util.List;

import ar.com.buildingways.controlDeStock.model.Producto;

public interface ProductoService {
	
	Producto findById(int id);
     
    void saveProducto(Producto producto);
     
    void updateProducto(Producto producto);
     
    void deleteProducto(int id);
 
    List<Producto> findAllProductos(); 

}
