package com.igor.bookstore.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
public class Categoria {

    @EqualsAndHashCode.Include
    private Integer id;

    private String nome;

    private String descricao;

    private List<Livro> livros = new ArrayList<>();

}
