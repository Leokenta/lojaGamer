package org.example.Repositories;

import org.example.Entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepositories extends JpaRepository<Fornecedor,Long> {
}
