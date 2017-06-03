create table PRODUCTOS (
   id BIGINT NOT NULL AUTO_INCREMENT,
   descripcion VARCHAR(100) NOT NULL,
   unidad VARCHAR(10) NOT NULL,
   precio_unitario MONEY NOT NULL,
   fecha_carga TIMESTAMP NOT NULL,
   fecha_modificacion TIMESTAMP,
   PRIMARY KEY (id),
);