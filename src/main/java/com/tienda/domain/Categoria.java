package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data //Nos permite tener el getter, setter y otros atributos como toString, hashcode, ect. En nuestras variables.
@Entity //Indica el objeto de clase identidad
@Table(name = "categoria") //Para mapeo de las tablas en mysql
public class Categoria implements Serializable { //permite que cuando guardemos y jalemos datos de mysql se serialice

    private static final long serialVersionUID = 1L; //identificador de version

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria; // Hibernate transforma en id_categoria
    private String descripcion;
    private String rutaImagen;
    private boolean activo; 

    public Categoria() {

    }
    
    //Se crea el constructor para estas variable para poder modificarlas o actualizarlas en las tablas.
    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }

}
