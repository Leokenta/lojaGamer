package org.example.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contato       [l")
    private Long id;
}
