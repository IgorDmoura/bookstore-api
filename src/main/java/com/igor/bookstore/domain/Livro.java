package com.igor.bookstore.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Livro {

    @EqualsAndHashCode.Include
    private Integer id;

    private String titulo;

    private String nomeAutor;

    private String texto;

    private Categoria categoria;
}
