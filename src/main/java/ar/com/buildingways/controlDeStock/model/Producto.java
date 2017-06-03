package ar.com.buildingways.controlDeStock.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
@Entity
@Table(name="PRODUCTOS")
public class Producto implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
 
    @NotEmpty
    @Column(name="descripcion", nullable=false)
    private String descripcion;
         
    @NotEmpty
    @Column(name="unidad", nullable=false)
    private String unidad;
 
    @NotEmpty
    @Column(name="precio_unitario", nullable=false)
    private double precioUnitario;
 
    @NotEmpty
    @Column(name="fecha_carga", nullable=false)
    private String fechaCarga;
    
    @NotEmpty
    @Column(name="fecha_modificacion", nullable=false)
    private String fechaModificacion;
 
    @NotEmpty
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "APP_USER_USER_PROFILE", 
             joinColumns = { @JoinColumn(name = "USER_ID") }, 
             inverseJoinColumns = { @JoinColumn(name = "USER_PROFILE_ID") })
    private Set<UserProfile> userProfiles = new HashSet<UserProfile>();
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public String getUnidad() {
        return unidad;
    }
 
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
 
    public double getPrecioUnitario() {
        return precioUnitario;
    }
 
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
 
    public String getFechaCarga() {
        return fechaCarga;
    }
 
    public void setFechaCarga(String fechaCarga) {
        this.fechaCarga = fechaCarga;
    }
 
    public String getFechaModificacion() {
        return fechaModificacion;
    }
 
    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
 
    public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }
 
    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Producto))
            return false;
        Producto other = (Producto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Producto [id=" + id + ", descripcion=" + descripcion + "]";
    }
}
