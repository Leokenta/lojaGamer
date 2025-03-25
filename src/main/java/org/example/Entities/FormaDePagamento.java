package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class FormaDePagamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pagamento")
    private Long id;

    @Column(length = 255,name = "descricao",nullable = false)
    private String descricao;
    @Column(length = 255,name = "tipo",nullable = false)
    private String tipo;
    @Column(length = 255,name = "status",nullable = false)
    private String status;

    public FormaDePagamento() {
    }

    public FormaDePagamento(Long id, String descricao, String tipo, String status) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
