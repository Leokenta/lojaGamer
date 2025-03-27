package org.example.Repositories;

import org.example.Entities.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRespositories extends JpaRepository<Contato,Long> {
}
