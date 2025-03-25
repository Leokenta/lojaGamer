package org.example.Repositories;

import org.example.Entities.FormaDePagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PagamentoRepositories extends JpaRepository<FormaDePagamento,Long> {
}
