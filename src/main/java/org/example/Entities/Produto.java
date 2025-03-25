package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Long id;

    @Column(length = 255,name = "descricao",nullable = false)
    private String descricao;
    @Column(length = 255,name = "precoCusto",nullable = false)
    private String precoCusto;

    @Column(length = 255,name = "precoVenda",nullable = false)
    private String precoVenda;


    @Column(length = 255,name = "estoque",nullable = false)
    private String estoque;


    public Produto() {
    }

    public Produto(Long id, String descricao, String precoCusto, String precoVenda, String estoque) {
        this.id = id;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(String precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }
}