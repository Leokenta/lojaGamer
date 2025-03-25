package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornecedor")
    private Long id;

    @Column(length = 255,name = "razaoSocial",nullable = false)
    private String razaoSocial;

    @Column(length = 255,name = "nomeFantasia",nullable = false)
    private String nomeFantasia;

    @Column(length = 255,name = "cnpj",nullable = false)
    private String cnpj;

    @Column(length = 255,name = "status",nullable = false)
    private String status;


    public Fornecedor() {
    }

    public Fornecedor(Long id, String razaoSocial, String nomeFantasia, String cnpj, String status) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
//- Id
//- RazaoSocial
//- NomeFantasia
//- Cnpj
//- Status