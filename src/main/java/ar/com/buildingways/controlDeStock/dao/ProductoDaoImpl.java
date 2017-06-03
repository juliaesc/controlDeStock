package ar.com.buildingways.controlDeStock.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ar.com.buildingways.controlDeStock.model.Producto;

@Repository("productoDao")
public class ProductoDaoImpl extends AbstractDao<Integer, Producto> implements ProductoDao {

	static final Logger logger = LoggerFactory.getLogger(ProductoDaoImpl.class);

	@Override
	public Producto findById(int id) {
		Producto producto = getByKey(id);
        if(producto!=null){
            Hibernate.initialize(producto.getUserProfiles());
        }
        return producto;
	}

	@Override
	public void save(Producto producto) {
		persist(producto);
	}

	@Override
	public void delete(int id) {
		Criteria crit = createEntityCriteria();
        crit.add(Restrictions.eq("id", id));
        Producto producto = (Producto)crit.uniqueResult();
        delete(producto);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> findAllProductos() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("descripcion"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Producto> productos = (List<Producto>) criteria.list();
        for(Producto producto : productos){
            Hibernate.initialize(producto.getUserProfiles());
        }
        return productos;
	}
}
