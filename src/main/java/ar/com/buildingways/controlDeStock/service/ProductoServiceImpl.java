package ar.com.buildingways.controlDeStock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.com.buildingways.controlDeStock.dao.ProductoDao;
import ar.com.buildingways.controlDeStock.model.Producto;

@Service("productoService")
@Transactional
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
    private ProductoDao dao;
    
	@Override
	public Producto findById(int id) {
		return dao.findById(id);
	}

	@Override
	public void saveProducto(Producto producto) {
		dao.save(producto);
	}

	@Override
	public void updateProducto(Producto producto) {
//		Producto entity = dao.findById(producto.getId());
//        if(entity!=null){
//            entity.setId(producto.getId());
//            entity.setDescripcion(producto.getDescripcion());
//            entity.setUnidad(producto.getUnidad());
//            entity.setPrecioUnitario(producto.getPrecioUnitario());
//            entity.setFechaCarga(producto.getFechaCarga());
//            entity.setFechaModificacion(producto.getFechaModificacion());
//        }
	}

	@Override
	public void deleteProducto(int id) {
		dao.delete(id);
	}

	@Override
	public List<Producto> findAllProductos() {
		return dao.findAllProductos();
	}
}
