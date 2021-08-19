package com.igor.bookstore.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Livro implements Serializable {

    private static final long seriaVersionUID= 1L;

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;

    private String nomeAutor;

    private String texto;

    @ManyToOne
    private Categoria categoria;
}
