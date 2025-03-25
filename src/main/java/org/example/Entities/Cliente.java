package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long id;

    @Column(length = 255,name = "nome",nullable = false)
    private String nome;

    @Column(length = 25,name = "cpf",nullable = false)
    private String cpf;

    @Column(length = 25,name = "dataNascimento",nullable = false)
    private String dataNascimento;

    @Column(length = 254,name = "status",nullable = false)
    private String status;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String cpf, String dataNascimento, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
