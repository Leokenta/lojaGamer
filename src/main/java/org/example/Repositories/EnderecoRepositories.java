package org.example.Repositories;

import org.example.Entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepositories extends JpaRepository<Endereco,Long> {
}
